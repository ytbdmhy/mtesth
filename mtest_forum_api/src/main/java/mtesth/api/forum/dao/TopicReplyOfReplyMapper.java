package mtesth.api.forum.dao;

import mtesth.api.forum.model.TopicReplyOfReply;

public interface TopicReplyOfReplyMapper {
    int insert(TopicReplyOfReply record);

    int insertSelective(TopicReplyOfReply record);
}