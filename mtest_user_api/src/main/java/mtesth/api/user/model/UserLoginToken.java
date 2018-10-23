package mtesth.api.user.model;

import java.util.Date;

public class UserLoginToken {
    private String usreToken;

    private Integer userId;

    private Date createDatetime;

    public String getUsreToken() {
        return usreToken;
    }

    public void setUsreToken(String usreToken) {
        this.usreToken = usreToken == null ? null : usreToken.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}