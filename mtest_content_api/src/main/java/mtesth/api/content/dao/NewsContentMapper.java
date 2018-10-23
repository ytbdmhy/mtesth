package mtesth.api.content.dao;

import mtesth.api.content.model.NewsContent;

public interface NewsContentMapper {
    int insert(NewsContent record);

    int insertSelective(NewsContent record);
}