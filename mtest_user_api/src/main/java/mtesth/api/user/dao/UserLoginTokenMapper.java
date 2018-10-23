package mtesth.api.user.dao;

import mtesth.api.user.model.UserLoginToken;

public interface UserLoginTokenMapper {
    int insert(UserLoginToken record);

    int insertSelective(UserLoginToken record);
}