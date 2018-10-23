package mtesth.api.content.dao;

import mtesth.api.content.model.VideoCategory;

public interface VideoCategoryMapper {
    int insert(VideoCategory record);

    int insertSelective(VideoCategory record);
}