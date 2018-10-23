package mtesth.api.user.dao;

import mtesth.api.user.model.SysRole;

public interface SysRoleMapper {
    int insert(SysRole record);

    int insertSelective(SysRole record);
}