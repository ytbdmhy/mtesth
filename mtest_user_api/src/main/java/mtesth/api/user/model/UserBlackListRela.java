package model;

import java.util.Date;

public class UserBlackListRela {
    private Integer id;

    private Integer userId;

    private Integer blackUserId;

    private Date createDatetime;

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

    public Integer getBlackUserId() {
        return blackUserId;
    }

    public void setBlackUserId(Integer blackUserId) {
        this.blackUserId = blackUserId;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}