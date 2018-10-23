package mtesth.api.common.dao;

import mtesth.api.common.model.PlaceAdv;

public interface PlaceAdvMapper {
    int insert(PlaceAdv record);

    int insertSelective(PlaceAdv record);
}