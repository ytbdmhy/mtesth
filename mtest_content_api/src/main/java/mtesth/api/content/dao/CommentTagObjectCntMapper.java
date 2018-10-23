package mtesth.api.content.dao;

import mtesth.api.content.model.CommentTagObjectCnt;

public interface CommentTagObjectCntMapper {
    int insert(CommentTagObjectCnt record);

    int insertSelective(CommentTagObjectCnt record);
}