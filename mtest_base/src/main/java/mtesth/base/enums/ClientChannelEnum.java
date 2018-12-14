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
    android_client()

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
