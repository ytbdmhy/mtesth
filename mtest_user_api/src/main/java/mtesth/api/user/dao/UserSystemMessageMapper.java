package mtesth.api.user.dao;

import mtesth.api.user.model.UserSystemMessage;

public interface UserSystemMessageMapper {
    int insert(UserSystemMessage record);

    int insertSelective(UserSystemMessage record);
}