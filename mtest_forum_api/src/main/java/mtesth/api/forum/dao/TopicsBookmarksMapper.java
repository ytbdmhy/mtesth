package mtesth.api.forum.dao;

import mtesth.api.forum.model.TopicsBookmarks;

public interface TopicsBookmarksMapper {
    int insert(TopicsBookmarks record);

    int insertSelective(TopicsBookmarks record);
}