package mtesth.api.user.dao;

import mtesth.api.user.model.UserPushRef;

public interface UserPushRefMapper {
    int insert(UserPushRef record);

    int insertSelective(UserPushRef record);
}