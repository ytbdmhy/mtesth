package mtesth.api.log.model;

import java.util.Date;

public class UserLoginLog {
    private Integer id;

    private String userToken;

    private Integer userId;

    private Date loginDate;

    private Date loginDatetime;

    private String loginIp;

    private String loginDeviceNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken == null ? null : userToken.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getLoginDeviceNo() {
        return loginDeviceNo;
    }

    public void setLoginDeviceNo(String loginDeviceNo) {
        this.loginDeviceNo = loginDeviceNo == null ? null : loginDeviceNo.trim();
    }
}