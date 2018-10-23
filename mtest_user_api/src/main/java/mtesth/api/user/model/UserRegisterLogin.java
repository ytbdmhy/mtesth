package mtesth.api.user.model;

import java.util.Date;

public class UserRegisterLogin {
    private Integer userId;

    private Date registerDate;

    private Date registerDatetime;

    private String registerIp;

    private String registerDeviceNo;

    private String registerOsVersion;

    private String registerWay;

    private String registerSource;

    private Integer loginCount;

    private Date lastLoginDate;

    private Date lastLoginDatetime;

    private String lastLoginIp;

    private String lastLoginDeviceNo;

    private Date updateDatetime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(Date registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public String getRegisterDeviceNo() {
        return registerDeviceNo;
    }

    public void setRegisterDeviceNo(String registerDeviceNo) {
        this.registerDeviceNo = registerDeviceNo == null ? null : registerDeviceNo.trim();
    }

    public String getRegisterOsVersion() {
        return registerOsVersion;
    }

    public void setRegisterOsVersion(String registerOsVersion) {
        this.registerOsVersion = registerOsVersion == null ? null : registerOsVersion.trim();
    }

    public String getRegisterWay() {
        return registerWay;
    }

    public void setRegisterWay(String registerWay) {
        this.registerWay = registerWay == null ? null : registerWay.trim();
    }

    public String getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(String registerSource) {
        this.registerSource = registerSource == null ? null : registerSource.trim();
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLoginDatetime() {
        return lastLoginDatetime;
    }

    public void setLastLoginDatetime(Date lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public String getLastLoginDeviceNo() {
        return lastLoginDeviceNo;
    }

    public void setLastLoginDeviceNo(String lastLoginDeviceNo) {
        this.lastLoginDeviceNo = lastLoginDeviceNo == null ? null : lastLoginDeviceNo.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}