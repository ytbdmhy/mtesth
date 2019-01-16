package mtesth.base.enums;

import mtesth.base.annotations.ApiMethod;
import mtesth.base.interfaces.Api;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 公开API列表
 * Created by Administrator on 2018/12/14.
 */
public enum ApiMethodEnum implements Api {

    /**
     * 登录
     */
    USER_LOGIN("user.login", "登录", ApiServerEnum.user_api, ContentTypeEnum.user_account, false) {
        @Override
        public Map<String, String> getApiParams() {
            Map<String, String> paramMap = new LinkedHashMap<String, String>();
            paramMap.put("username", "用户名(*)");
            paramMap.put("password", "密码(*)");
            return paramMap;
        }
    }
    ;

    private String code;
    private String msg;
    private ApiServerEnum apiServer;
    private ContentTypeEnum contentType;
    private boolean needLogin;

    /**
     *
     * @param code
     *              编码
     * @param msg
     *              描述
     * @param apiServer
     *              所属服务器
     * @param contentType
     *              所属业务
     * @param needLogin
     *              是否需要登录
     */
    ApiMethodEnum(String code, String msg, ApiServerEnum apiServer, ContentTypeEnum contentType, boolean needLogin) {
        this.code = code;
        this.msg = msg;
        this.apiServer = apiServer;
        this.contentType = contentType;
        this.needLogin = needLogin;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public ApiServerEnum getApiServer() {
        return apiServer;
    }

    public ContentTypeEnum getContentType() {
        return contentType;
    }

    public boolean isNeedLogin() {
        return needLogin;
    }

    /**
     * 获取所有API方法枚举
     * @return
     */
    public static Map<String, ApiMethodEnum> getApiMethodEnumMap() {
        Map<String, ApiMethodEnum> retMap = new LinkedHashMap<String, ApiMethodEnum>();
        ApiMethodEnum[] enumArr = ApiMethodEnum.values();
        for (ApiMethodEnum aEnum : enumArr) {
            retMap.put(aEnum.getCode(), aEnum);
        }
        return retMap;
    }

    /**
     * 根据服务器获取API方法（供对外的API测试工具使用）
     * @param apiServer
     * @return
     */
    public static Map<String, String> getApiMethodMapByServer(String apiServer) {
        ApiServerEnum sEnum = ApiServerEnum.getApiServerEnum(apiServer);
        Map<String, String> retMap = new LinkedHashMap<String, String>();
        if (sEnum != null) {
            ApiMethodEnum[] enumArr = ApiMethodEnum.values();
            for (ApiMethodEnum aEnum : enumArr) {
                if (sEnum.name().equals(aEnum.getApiServer().name())) {
                    retMap.put(aEnum.getCode(), aEnum.getMsg());
                }
            }
        }
        return retMap;
    }

    /**
     * 根据API方法编号获取参数列表（供API测试工具使用）
     * @param methodCode
     * @return
     */
    public static Map<String, String> getApiParamMapByMethod(String methodCode) {
        ApiMethodEnum mEnum = ApiMethodEnum.getApiMethodEnum(methodCode);
        if (mEnum != null) {
            return mEnum.getApiParams();
        }
        return null;
    }

    public static ApiMethodEnum getApiMethodEnum(String methodCode) {
        return getApiMethodEnumMap().get(methodCode);
    }

    /**
     * 根据API方法编号获取所属服务器（供API总控制中心分发使用）
     * @param methodCode
     * @return
     */
    public static ApiServerEnum getApiServerEnum(String methodCode) {
        ApiMethodEnum aEnum =getApiMethodEnumMap().get(methodCode);
        if (aEnum != null) {
            return aEnum.getApiServer();
        }
        return null;
    }
}
