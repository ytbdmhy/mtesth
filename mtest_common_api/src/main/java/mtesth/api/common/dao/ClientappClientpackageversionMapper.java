package mtesth.api.common.dao;

import mtesth.api.common.model.ClientappClientpackageversionWithBLOBs;

public interface ClientappClientpackageversionMapper {
    int insert(ClientappClientpackageversionWithBLOBs record);

    int insertSelective(ClientappClientpackageversionWithBLOBs record);
}