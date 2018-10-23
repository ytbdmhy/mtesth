package mtesth.api.forum.dao;

import mtesth.api.forum.model.TopicReply;

public interface TopicReplyMapper {
    int insert(TopicReply record);

    int insertSelective(TopicReply record);
}