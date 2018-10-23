package mtesth.api.content.dao;

import mtesth.api.content.model.PcGamePlatform;

public interface PcGamePlatformMapper {
    int insert(PcGamePlatform record);

    int insertSelective(PcGamePlatform record);
}