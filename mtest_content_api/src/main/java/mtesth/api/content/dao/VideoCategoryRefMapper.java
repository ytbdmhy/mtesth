package mtesth.api.content.dao;

import mtesth.api.content.model.VideoCategoryRef;

public interface VideoCategoryRefMapper {
    int insert(VideoCategoryRef record);

    int insertSelective(VideoCategoryRef record);
}