package mtesth.api.user.dao;

import mtesth.api.user.model.SysRoleMenu;

public interface SysRoleMenuMapper {
    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);
}