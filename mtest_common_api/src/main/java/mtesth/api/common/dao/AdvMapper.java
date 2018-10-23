package mtesth.api.common.dao;

import mtesth.api.common.model.Adv;

public interface AdvMapper {
    int insert(Adv record);

    int insertSelective(Adv record);
}