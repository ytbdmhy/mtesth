package mtesth.api.content.dao;

import mtesth.api.content.model.CommentTaggeditems;

public interface CommentTaggeditemsMapper {
    int insert(CommentTaggeditems record);

    int insertSelective(CommentTaggeditems record);
}