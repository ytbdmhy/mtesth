package mtesth.base.enums;

/**
 * Created by Administrator on 2019-01-13.
 */

/**
 * 内容实体类型<br>
 * 每一张表对应一个枚举
 */
public enum ContentTypeEnum {

    user_account(1),

    ;

    Integer id;

    ContentTypeEnum(Integer _id) {
        this.id = _id;
    }

    public Integer getId() {
        return id;
    }

    /**
     * 根据API方法编号获取参数列表（供API测试工具使用）
     * @param id
     * @return
     */
    public static ContentTypeEnum getContentTypeEnum(Integer id) {
        ContentTypeEnum[] enumArr = ContentTypeEnum.values();
        for (ContentTypeEnum aEnum : enumArr) {
            if (aEnum.getId().intValue() == id.intValue()) {
                return aEnum;
            }
        }
        return null;
    }

    /**
     * 根据API方法编号获取所属服务器（供API总控制中心分发使用）
     * @param id
     * @return
     */
    public static String getContentType(Integer id) {
        ContentTypeEnum aEnum = getContentTypeEnum(id);
        if (aEnum != null) {
            return aEnum.name().toLowerCase();
        }
        return null;
    }
}
