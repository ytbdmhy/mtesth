package mtesth.api.user.dao;

import mtesth.api.user.model.UserRegisterLogin;

public interface UserRegisterLoginMapper {
    int insert(UserRegisterLogin record);

    int insertSelective(UserRegisterLogin record);
}