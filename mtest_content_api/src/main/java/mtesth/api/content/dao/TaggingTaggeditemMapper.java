package mtesth.api.content.dao;

import mtesth.api.content.model.TaggingTaggeditem;

public interface TaggingTaggeditemMapper {
    int insert(TaggingTaggeditem record);

    int insertSelective(TaggingTaggeditem record);
}