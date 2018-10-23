package mtesth.api.content.dao;

import mtesth.api.content.model.Video;

public interface VideoMapper {
    int insert(Video record);

    int insertSelective(Video record);
}