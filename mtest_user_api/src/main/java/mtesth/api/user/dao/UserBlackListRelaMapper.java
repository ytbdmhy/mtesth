package dao;

import model.UserBlackListRela;

public interface UserBlackListRelaMapper {
    int insert(UserBlackListRela record);

    int insertSelective(UserBlackListRela record);
}