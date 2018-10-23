package mtesth.api.content.dao;

import mtesth.api.content.model.PackageComment;

public interface PackageCommentMapper {
    int insert(PackageComment record);

    int insertSelective(PackageComment record);
}