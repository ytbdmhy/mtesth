package mtesth.api.user.dao;

import mtesth.api.user.model.SysUser;

public interface SysUserMapper {
    int insert(SysUser record);

    int insertSelective(SysUser record);
}