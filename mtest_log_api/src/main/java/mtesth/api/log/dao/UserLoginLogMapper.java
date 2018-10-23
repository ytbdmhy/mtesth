package mtesth.api.log.dao;

import mtesth.api.log.model.UserLoginLog;

public interface UserLoginLogMapper {
    int insert(UserLoginLog record);

    int insertSelective(UserLoginLog record);
}