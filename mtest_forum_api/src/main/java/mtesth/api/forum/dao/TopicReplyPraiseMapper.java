package mtesth.api.forum.dao;

import mtesth.api.forum.model.TopicReplyPraise;

public interface TopicReplyPraiseMapper {
    int insert(TopicReplyPraise record);

    int insertSelective(TopicReplyPraise record);
}