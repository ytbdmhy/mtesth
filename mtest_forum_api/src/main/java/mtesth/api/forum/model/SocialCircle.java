package mtesth.api.forum.model;

import java.util.Date;

public class SocialCircle {
    private Integer id;

    private String name;

    private String summary;

    private String cover;

    private Integer orderNo;

    private Integer isRecommend;

    private Integer topicCount;

    private Integer todayTopicCount;

    private Integer isEnable;

    private Integer isDelete;

    private Date createTime;

    private Date updateTime;

    private String titlePrefix;

    private String backendTitlePrefix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getTopicCount() {
        return topicCount;
    }

    public void setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
    }

    public Integer getTodayTopicCount() {
        return todayTopicCount;
    }

    public void setTodayTopicCount(Integer todayTopicCount) {
        this.todayTopicCount = todayTopicCount;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTitlePrefix() {
        return titlePrefix;
    }

    public void setTitlePrefix(String titlePrefix) {
        this.titlePrefix = titlePrefix == null ? null : titlePrefix.trim();
    }

    public String getBackendTitlePrefix() {
        return backendTitlePrefix;
    }

    public void setBackendTitlePrefix(String backendTitlePrefix) {
        this.backendTitlePrefix = backendTitlePrefix == null ? null : backendTitlePrefix.trim();
    }
}