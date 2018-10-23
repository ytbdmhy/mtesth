package mtesth.api.user.dao;

import mtesth.api.user.model.SysMenu;

public interface SysMenuMapper {
    int insert(SysMenu record);

    int insertSelective(SysMenu record);
}