package mtesth.base.enums;

/**
 * Created by Administrator on 2018/12/14.
 */
public enum BindPlatformEnum {

    /**
     * WECHAT
     */
    WECHAT(1),

    /**
     * QQ
     */
    QQ(2),

    /**
     * WEIBO
     */
    WEIBO(3),

    /**
     * DOUBAN
     */
    DOUBAN(4),

    ;

    private int id;

    BindPlatformEnum(int id ) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static BindPlatformEnum getBindPlatformEnum(String code) {
        try {
            return BindPlatformEnum.valueOf(code.toUpperCase());
        } catch (Exception e) {
            return null;
        }
    }
}
