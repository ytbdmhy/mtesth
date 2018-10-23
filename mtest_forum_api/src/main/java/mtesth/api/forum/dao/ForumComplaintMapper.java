package mtesth.api.forum.dao;

import mtesth.api.forum.model.ForumComplaint;

public interface ForumComplaintMapper {
    int insert(ForumComplaint record);

    int insertSelective(ForumComplaint record);
}