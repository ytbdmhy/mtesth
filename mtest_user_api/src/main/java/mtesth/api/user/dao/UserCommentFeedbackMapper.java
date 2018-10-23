package mtesth.api.user.dao;

import mtesth.api.user.model.UserCommentFeedback;

public interface UserCommentFeedbackMapper {
    int insert(UserCommentFeedback record);

    int insertSelective(UserCommentFeedback record);
}