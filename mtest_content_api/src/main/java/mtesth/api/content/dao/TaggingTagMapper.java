package mtesth.api.content.dao;

import mtesth.api.content.model.TaggingTag;

public interface TaggingTagMapper {
    int insert(TaggingTag record);

    int insertSelective(TaggingTag record);
}