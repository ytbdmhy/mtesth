package mtesth.api.forum.dao;

import mtesth.api.forum.model.Topics;

public interface TopicsMapper {
    int insert(Topics record);

    int insertSelective(Topics record);
}