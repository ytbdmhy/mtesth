package mtesth.base.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/14.
 */
public enum ClientChannelEnum {

    /**
     * 后台渠道
     */
    android_client("android_client", "android_client"),
    ios_client("ios_client", "ios_client"),
    backend_client("backend_client", "backend_client"),

    /**
     * 应用渠道
     */
    market_360("market_360", "market_360"),
    market_baidu("market_baidu", "market_baidu"),
    market_tencent("market_tencent", "market_tencent"),
    market_guanfang("market_guanfang", "market_guanfang"),
    market_wadouja("market_wadouja", "market_wadouja"),
    market_meizu("market_meizu", "market_meizu"),
    market_oppo("market_oppo", "market_oppo"),
    market_vivo("market_vivo", "market_vivo"),
    market_jinli("market_jinli", "market_jinli"),
    market_huawei("market_huawei", "market_huawei"),
    market_yingyonghui("market_yingyonghui", "market_yingyonghui"),

    ;

    private String channelCode;
    private String description;

    ClientChannelEnum(String channelCode, String description) {
        this.channelCode = channelCode;
        this.description = description;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ClientChannelEnum[] getClientChannels() {
        return ClientChannelEnum.values();
    }

    public static Map<String, String> getClientChannelMap() {
        Map<String, String> retMap = new LinkedHashMap<String, String>();
        for (ClientChannelEnum aEnum : ClientChannelEnum.values()) {
            retMap.put(aEnum.getChannelCode(), aEnum.getDescription());
        }
        return retMap;
    }

    public static String getClientChannelCode(String channelCode) {
        return getClientChannelMap().get(channelCode);
    }
}
