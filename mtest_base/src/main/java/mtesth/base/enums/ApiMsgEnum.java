package mtesth.base.enums;

/**
 * Created by Administrator on 2019-02-11.
 */

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * API消息代码
 * 0000-0999表示系统级错误代码
 * 1000-1999表示用户体系错误代码
 * 2000-2999表示内容体系错误代码
 * 3000-3999表示公用体系错误代码
 */
public enum ApiMsgEnum {
    // 这一部分是系统级错误代码（从0000开始到0999）
    /**
     * 操作成功
     */
    SUCCESS(Boolean.TRUE, "0000", "成功", "成功"),

    ;

    public Boolean isSuccess;
    public String code;
    public String msg;
    public String userMsg;

    ApiMsgEnum(Boolean isSuccess, String code, String msg, String userMsg) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.msg = msg;
        this.userMsg = userMsg;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUserMsg() {
        return userMsg;
    }

    public void setUserMsg(String userMsg) {
        this.userMsg = userMsg;
    }

    public static Map<String, String> getAll() {
        Map<String, String> retMap = new LinkedHashMap<String, String>();
        ApiMsgEnum[] enumArr = ApiMsgEnum.values();
        for (ApiMsgEnum aEnum : enumArr) {
            retMap.put(aEnum.getCode(), aEnum.getMsg());
        }
        return retMap;
    }

    public static ApiMsgEnum getByCode(String code) {
        ApiMsgEnum[] enumArr = ApiMsgEnum.values();
        for (ApiMsgEnum aEnum : enumArr) {
            if (aEnum.getCode().equals(code)) {
                return aEnum;
            }
        }
        return null;
    }
}
