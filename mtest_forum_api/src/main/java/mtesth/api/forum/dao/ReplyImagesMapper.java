package mtesth.api.forum.dao;

import mtesth.api.forum.model.ReplyImages;

public interface ReplyImagesMapper {
    int insert(ReplyImages record);

    int insertSelective(ReplyImages record);
}