package mtesth.api.log.model;

import java.util.Date;

public class UserExperienceChangeLog {
    private Integer id;

    private Integer userId;

    private String userName;

    private String platform;

    private String actionType;

    private String actionName;

    private String actionTitle;

    private Integer experience;

    private Integer beforeExperience;

    private Integer afterExperience;

    private String userAgent;

    private String ip;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType == null ? null : actionType.trim();
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    public String getActionTitle() {
        return actionTitle;
    }

    public void setActionTitle(String actionTitle) {
        this.actionTitle = actionTitle == null ? null : actionTitle.trim();
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getBeforeExperience() {
        return beforeExperience;
    }

    public void setBeforeExperience(Integer beforeExperience) {
        this.beforeExperience = beforeExperience;
    }

    public Integer getAfterExperience() {
        return afterExperience;
    }

    public void setAfterExperience(Integer afterExperience) {
        this.afterExperience = afterExperience;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}