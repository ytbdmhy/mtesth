package mtesth.api.forum.dao;

import mtesth.api.forum.model.SocialCircle;

public interface SocialCircleMapper {
    int insert(SocialCircle record);

    int insertSelective(SocialCircle record);
}