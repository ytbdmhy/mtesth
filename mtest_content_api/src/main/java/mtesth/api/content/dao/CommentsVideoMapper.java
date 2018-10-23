package mtesth.api.content.dao;

import mtesth.api.content.model.CommentsVideoWithBLOBs;

public interface CommentsVideoMapper {
    int insert(CommentsVideoWithBLOBs record);

    int insertSelective(CommentsVideoWithBLOBs record);
}