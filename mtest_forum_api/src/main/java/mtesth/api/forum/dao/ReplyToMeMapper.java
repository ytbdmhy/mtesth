package mtesth.api.forum.dao;

import mtesth.api.forum.model.ReplyToMe;

public interface ReplyToMeMapper {
    int insert(ReplyToMe record);

    int insertSelective(ReplyToMe record);
}