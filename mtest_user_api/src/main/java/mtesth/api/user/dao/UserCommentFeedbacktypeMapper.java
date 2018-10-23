package mtesth.api.user.dao;

import mtesth.api.user.model.UserCommentFeedbacktype;

public interface UserCommentFeedbacktypeMapper {
    int insert(UserCommentFeedbacktype record);

    int insertSelective(UserCommentFeedbacktype record);
}