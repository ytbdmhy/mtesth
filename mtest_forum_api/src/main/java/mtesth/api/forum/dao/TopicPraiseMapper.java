package mtesth.api.forum.dao;

import mtesth.api.forum.model.TopicPraise;

public interface TopicPraiseMapper {
    int insert(TopicPraise record);

    int insertSelective(TopicPraise record);
}