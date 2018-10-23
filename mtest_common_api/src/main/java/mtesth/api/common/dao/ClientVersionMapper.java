package mtesth.api.common.dao;

import mtesth.api.common.model.ClientVersionWithBLOBs;

public interface ClientVersionMapper {
    int insert(ClientVersionWithBLOBs record);

    int insertSelective(ClientVersionWithBLOBs record);
}