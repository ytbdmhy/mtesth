package mtesth.api.user.dao;

import mtesth.api.user.model.UserAccount;

public interface UserAccountMapper {
    int insert(UserAccount record);

    int insertSelective(UserAccount record);
}