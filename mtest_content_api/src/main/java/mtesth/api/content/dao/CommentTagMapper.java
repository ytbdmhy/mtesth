package mtesth.api.content.dao;

import mtesth.api.content.model.CommentTag;

public interface CommentTagMapper {
    int insert(CommentTag record);

    int insertSelective(CommentTag record);
}