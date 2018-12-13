package mtesth.apicenter.web;

import com.hgv.base.enums.ApiMethodEnum;
import mtesth.base.constants.Constant;
import mtesth.base.web.WebHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    }
}
