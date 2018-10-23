package mtesth.api.common.dao;

import mtesth.api.common.model.ConfSetting;

public interface ConfSettingMapper {
    int insert(ConfSetting record);

    int insertSelective(ConfSetting record);
}