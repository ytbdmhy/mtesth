package mtesth.api.content.dao;

import mtesth.api.content.model.HotTag;

public interface HotTagMapper {
    int insert(HotTag record);

    int insertSelective(HotTag record);
}