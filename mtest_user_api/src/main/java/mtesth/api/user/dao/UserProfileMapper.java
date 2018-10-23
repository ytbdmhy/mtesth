package mtesth.api.user.dao;

import mtesth.api.user.model.UserProfile;

public interface UserProfileMapper {
    int insert(UserProfile record);

    int insertSelective(UserProfile record);
}