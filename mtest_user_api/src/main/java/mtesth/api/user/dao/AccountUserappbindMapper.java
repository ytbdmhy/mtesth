package mtesth.api.user.dao;

import mtesth.api.user.model.AccountUserappbind;

public interface AccountUserappbindMapper {
    int insert(AccountUserappbind record);

    int insertSelective(AccountUserappbind record);
}