package mtesth.api.content.dao;

import mtesth.api.content.model.CommentsNewsWithBLOBs;

public interface CommentsNewsMapper {
    int insert(CommentsNewsWithBLOBs record);

    int insertSelective(CommentsNewsWithBLOBs record);
}