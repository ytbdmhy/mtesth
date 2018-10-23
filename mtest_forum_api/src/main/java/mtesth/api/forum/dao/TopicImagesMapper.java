package mtesth.api.forum.dao;

import mtesth.api.forum.model.TopicImages;

public interface TopicImagesMapper {
    int insert(TopicImages record);

    int insertSelective(TopicImages record);
}