package mtesth.apicenter.web;

import mtesth.base.annotations.ApiMethod;
import mtesth.base.dto.ApiFinalResponse;
import mtesth.base.enums.ApiMethodEnum;
import mtesth.base.constants.Constant;
import mtesth.base.enums.ApiMsgEnum;
import mtesth.base.enums.ApiServerEnum;
import mtesth.base.interfaces.Api;
import mtesth.base.utils.HttpClientUtil;
import mtesth.base.utils.JsonUtil;
import mtesth.base.web.SuperDispatcherServlet;
import mtesth.base.web.WebHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/12.
 */
public class BaseController {
    private final Log log = LogFactory.getLog(BaseController.class);

    @Value("${nginx.key.regex}")
    protected String nginxKeyRegex;

    @Value("${user.api.server}")
    private String userApiServer;

    @Value("${content.api.server}")
    private String contentApiServer;

    @Value("${common.api.server}")
    private String commonApiServer;

    @Value("${forum.api.server}")
    private String forumApiServer;

    @Value("${log.api.server}")
    private String logApiServer;

    /**
     * nginx缓存服务器路径
     */
    @Value("${nginx.cache.file.dir}")
    protected String nginxCacheFileDir;

    protected Map<String, Object> getParamMapFromRequest(HttpServletRequest req) {
        Map<String, Object> reqParamMap = WebHelper.buildParamMapFromRequest(req);
        reqParamMap.put(Constant.REQUEST_IP, WebHelper.getRequestIp(req));
        reqParamMap.put(Constant.USER_AGENT, WebHelper.extractRequestHeader(req, "User-Agent"));
//        String authorization = WebHelper.extractRequestHeader(req, "Authorization");
//        if (!StringUtils.isEmpty(authorization) && authorization.indexOf("Token") != -1) {
//            reqParamMap.put(Constant.USER_TOKEN, authorization.replaceAll("Token", ""));
//        }
        return reqParamMap;
    }

    protected String innerCallApi(ApiMethodEnum apiMethodEnum, Map<String, Object> reqParamMap) {
        if (reqParamMap == null || !reqParamMap.containsKey(Constant.API_KEY)) {
            reqParamMap.put(Constant.API_KEY, Constant.INNER_API_KEY);
        }
        if (reqParamMap == null || !reqParamMap.containsKey(Constant.API_SIGN)) {
            reqParamMap.put(Constant.API_SIGN, Constant.INNER_API_SIGN);
        }
        return this.callApi(apiMethodEnum, reqParamMap);
    }

    /**
     * 调用API并输出json
     * @param apiMethodEnum
     *          API FUNCTION CODE
     * @param appendMap
     *          附加参数
     * @param req
     *          http请求
     * @param rsp
     *          http响应
     * @return
     */
    protected String callApiAndOutput(ApiMethodEnum apiMethodEnum, Map<String, Object> appendMap, HttpServletRequest req, HttpServletResponse rsp) {
        String retJson = this.innerCallApi(apiMethodEnum, appendMap);
        return WebHelper.outputJson(retJson, rsp);
    }

    protected String callApi(ApiMethodEnum apiMethodEnum, Map<String, Object> reqParamMap) {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put(apiMethodEnum.getCode(), reqParamMap);
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put(Constant.DATA, JsonUtil.objectToJson(dataMap, Map.class));
        HttpClientUtil clientUtil = new HttpClientUtil();
        Map<String, String> head = new HashMap<String, String>();
        int port = SuperDispatcherServlet.getlocalPort();
        head.put("referer", "apicenter/" + port);
        head.put("X-Hash-ip", (String) reqParamMap.get(Constant.REQUEST_IP));
        clientUtil.setHttpSetting(head);
        String retJson = clientUtil.doHttpPost(this.getApiServeURl(apiMethodEnum.getApiServer()), paramMap);
        return retJson;
    }

    protected String getApiServeURl(ApiServerEnum apiServerEnum) {
        if (ApiServerEnum.user_api.equals(apiServerEnum)) {
            return this.userApiServer;
        } else if (ApiServerEnum.content_api.equals(apiServerEnum)) {
            return this.contentApiServer;
        } else if (ApiServerEnum.common_api.equals(apiServerEnum)) {
            return this.commonApiServer;
        } else if (ApiServerEnum.log_api.equals(apiServerEnum)) {
            return this.logApiServer;
        } else if (ApiServerEnum.forum_api.equals(apiServerEnum)) {
            return this.forumApiServer;
        }
        return null;
    }

    protected String outoutApiFinalResponse(String functionCode, ApiMsgEnum apiMsgEnum, HttpServletResponse rsp) {
        if (functionCode == null || "".equals(functionCode)) {
            functionCode = "unknown";
        }
        ApiFinalResponse<String> apiFinalRsp = new ApiFinalResponse<String>();
        apiFinalRsp.setSuccess(apiMsgEnum.getSuccess());
        apiFinalRsp.setCode(apiMsgEnum.getCode());
        apiFinalRsp.setMsg(apiMsgEnum.getMsg());
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put(functionCode, apiFinalRsp);
        String retJson = JsonUtil.objectToJson(jsonMap);
        return WebHelper.outputJson(retJson, rsp);
    }

    protected String getHttpBody(HttpServletRequest request) {
        String result = "";
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
            StringBuffer sb = new StringBuffer();
            String tempIn = "";
            while ((tempIn = in.readLine()) != null) {
                sb.append(tempIn);
            }
            result = sb.toString();
        } catch (Exception e) {
            log.error("getHttpBody Exception", e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                log.error("getHttpBody Exception", ex);
            }
        }
        return result;
    }

    protected String outputJson(String json, HttpServletResponse response) {
//        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        try {
            PrintWriter out = response.getWriter();
            out.print(json);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
