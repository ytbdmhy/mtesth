package mtesth.api.forum.model;

import java.util.Date;

public class ReplyToMe {
    private Integer id;

    private Integer replyFrom;

    private Integer replyTo;

    private Integer replyType;

    private Integer topicId;

    private Integer replyId;

    private Integer replyOfReplyId;

    private Date lookTime;

    private Date createTime;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReplyFrom() {
        return replyFrom;
    }

    public void setReplyFrom(Integer replyFrom) {
        this.replyFrom = replyFrom;
    }

    public Integer getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(Integer replyTo) {
        this.replyTo = replyTo;
    }

    public Integer getReplyType() {
        return replyType;
    }

    public void setReplyType(Integer replyType) {
        this.replyType = replyType;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getReplyOfReplyId() {
        return replyOfReplyId;
    }

    public void setReplyOfReplyId(Integer replyOfReplyId) {
        this.replyOfReplyId = replyOfReplyId;
    }

    public Date getLookTime() {
        return lookTime;
    }

    public void setLookTime(Date lookTime) {
        this.lookTime = lookTime;
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