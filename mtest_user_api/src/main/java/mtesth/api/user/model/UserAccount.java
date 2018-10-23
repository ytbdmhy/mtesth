package mtesth.api.user.model;

import java.util.Date;

public class UserAccount {
    private Integer id;

    private String password;

    private Byte isSuperuser;

    private String username;

    private String email;

    private String phone;

    private String nickName;

    private String status;

    private Integer deleteFlag;

    private Integer fakeFlag;

    private Date updateDatetime;

    private String bbsUsername;

    private String bbsPasswd;

    private Integer bbsUid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getIsSuperuser() {
        return isSuperuser;
    }

    public void setIsSuperuser(Byte isSuperuser) {
        this.isSuperuser = isSuperuser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getFakeFlag() {
        return fakeFlag;
    }

    public void setFakeFlag(Integer fakeFlag) {
        this.fakeFlag = fakeFlag;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getBbsUsername() {
        return bbsUsername;
    }

    public void setBbsUsername(String bbsUsername) {
        this.bbsUsername = bbsUsername == null ? null : bbsUsername.trim();
    }

    public String getBbsPasswd() {
        return bbsPasswd;
    }

    public void setBbsPasswd(String bbsPasswd) {
        this.bbsPasswd = bbsPasswd == null ? null : bbsPasswd.trim();
    }

    public Integer getBbsUid() {
        return bbsUid;
    }

    public void setBbsUid(Integer bbsUid) {
        this.bbsUid = bbsUid;
    }
}