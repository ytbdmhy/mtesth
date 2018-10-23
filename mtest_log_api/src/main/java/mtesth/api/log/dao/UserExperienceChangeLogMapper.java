package mtesth.api.log.dao;

import mtesth.api.log.model.UserExperienceChangeLog;

public interface UserExperienceChangeLogMapper {
    int insert(UserExperienceChangeLog record);

    int insertSelective(UserExperienceChangeLog record);
}