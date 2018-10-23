package mtesth.api.forum.dao;

import mtesth.api.forum.model.UserSocialCircle;

public interface UserSocialCircleMapper {
    int insert(UserSocialCircle record);

    int insertSelective(UserSocialCircle record);
}