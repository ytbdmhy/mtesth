package mtesth.api.common.dao;

import mtesth.api.common.model.Place;

public interface PlaceMapper {
    int insert(Place record);

    int insertSelective(Place record);
}