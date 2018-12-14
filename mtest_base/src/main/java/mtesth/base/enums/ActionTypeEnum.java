package mtesth.base.enums;

/**
 * Created by Administrator on 2018/12/14.
 */
public enum  ActionTypeEnum {

    /**
     * 观看视频
     */
    watchVideo("观看视频", null, 2),

    /**
     * 下载游戏
     */
    downloadGame("下载游戏", null, 5),

    /**
     * 发表帖子
     */
    postBlog("发表帖子", null, 5),

    /**
     * 分享评测
     */
    shareNews("分享评测", null, 8),

    /**
     * 分享游戏
     */
    shareGame("分享游戏", null, 8),
    ;

    private String title;
    private String description;
    private Integer experience;

    ActionTypeEnum(String title, String description, Integer experience) {
        this.title = title;
        this.description = description;
        this.experience = experience;
    }

    public static ActionTypeEnum getByName(String name) {
        ActionTypeEnum[] enums = ActionTypeEnum.values();
        for (ActionTypeEnum ate : enums) {
            if (ate.name().equals(name)) {
                return ate;
            }
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
}
