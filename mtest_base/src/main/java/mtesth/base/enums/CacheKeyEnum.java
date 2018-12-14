package mtesth.base.enums;

/**
 * Created by Administrator on 2018/12/14.
 */
public enum CacheKeyEnum {

    /**
     * 配置项
     */
    setting("SETTING_"),

    /**
     * 短信间隔
     */
    sms_interval("SMS_INTERVAL_"),

    /**
     * 短信验证码
     */
    sms_validatecode("SMS_VALIDATECODE_"),

    /**
     * 邮件验证码
     */
    email_validatecode("EMAIL_VALIDATECODE_"),

    /**
     * 注册登录名
     */
    register_loginname("REGISTER_LOGINNAME_"),

    ;

    private String code;

    CacheKeyEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
