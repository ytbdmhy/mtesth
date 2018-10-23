package mtesth.api.content.dao;

import mtesth.api.content.model.CommonResource;

public interface CommonResourceMapper {
    int insert(CommonResource record);

    int insertSelective(CommonResource record);
}