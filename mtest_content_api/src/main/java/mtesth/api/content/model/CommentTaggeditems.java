package mtesth.api.content.model;

import java.util.Date;

public class CommentTaggeditems {
    private Integer id;

    private Integer objectId;

    private String contentType;

    private Integer commentTagId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    public Integer getCommentTagId() {
        return commentTagId;
    }

    public void setCommentTagId(Integer commentTagId) {
        this.commentTagId = commentTagId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}