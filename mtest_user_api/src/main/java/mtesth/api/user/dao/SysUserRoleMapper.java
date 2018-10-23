package mtesth.api.user.dao;

import mtesth.api.user.model.SysUserRole;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);
}