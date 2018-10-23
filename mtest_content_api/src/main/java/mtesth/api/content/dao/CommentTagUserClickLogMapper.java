package mtesth.api.content.dao;

import mtesth.api.content.model.CommentTagUserClickLog;

public interface CommentTagUserClickLogMapper {
    int insert(CommentTagUserClickLog record);

    int insertSelective(CommentTagUserClickLog record);
}