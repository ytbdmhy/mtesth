package mtesth.base.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * API服务列表
 * Created by Administrator on 2018/12/14.
 */
public enum ApiServerEnum {

    /**
     * 用户api
     */
    user_api("用户api"),

    /**
     * 内容api
     */
    content_api("内容api"),

    /**
     * 公用api
     */
    common_api("公用api"),

    /**
     * 论坛api
     */
    forum_api("论坛api"),

    /**
     * 日志api
     */
    log_api("日志api"),

    /**
     * 文件服务api
     */
    fileservice("文件服务api"),

    ;

    private String descript;

    ApiServerEnum(String descript) {
        this.descript = descript;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public static Map<String, String> getApiServerEnumMap() {
        Map<String, String> retMap = new LinkedHashMap<String, String>();
        ApiServerEnum[] enumArr = ApiServerEnum.values();
        for (ApiServerEnum aEnum : enumArr) {
            retMap.put(aEnum.name(), aEnum.getDescript());
        }
        return retMap;
    }

    public static ApiServerEnum getApiServerEnum(String name) {
        try {
            return ApiServerEnum.valueOf(name);
        } catch (Exception e) {
            return null;
        }
    }
}
