package mtesth.api.user.dao;

import mtesth.api.user.model.UserBookmark;

public interface UserBookmarkMapper {
    int insert(UserBookmark record);

    int insertSelective(UserBookmark record);
}