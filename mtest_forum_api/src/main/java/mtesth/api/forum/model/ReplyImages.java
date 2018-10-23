package mtesth.api.forum.model;

import java.util.Date;

public class ReplyImages {
    private Integer id;

    private Integer replyId;

    private String replyContentImage;

    private Date createTime;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getReplyContentImage() {
        return replyContentImage;
    }

    public void setReplyContentImage(String replyContentImage) {
        this.replyContentImage = replyContentImage == null ? null : replyContentImage.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}