package mtesth.api.content.model;

import java.util.Date;

public class VideoCategoryRef {
    private Integer id;

    private Integer videoId;

    private Integer categroyId;

    private Integer categroyPid;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getCategroyId() {
        return categroyId;
    }

    public void setCategroyId(Integer categroyId) {
        this.categroyId = categroyId;
    }

    public Integer getCategroyPid() {
        return categroyPid;
    }

    public void setCategroyPid(Integer categroyPid) {
        this.categroyPid = categroyPid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}