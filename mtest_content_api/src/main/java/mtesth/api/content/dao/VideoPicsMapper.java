package mtesth.api.content.dao;

import mtesth.api.content.model.VideoPics;

public interface VideoPicsMapper {
    int insert(VideoPics record);

    int insertSelective(VideoPics record);
}