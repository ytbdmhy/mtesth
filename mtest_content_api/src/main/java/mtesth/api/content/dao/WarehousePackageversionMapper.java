package mtesth.api.content.dao;

import mtesth.api.content.model.WarehousePackageversionWithBLOBs;

public interface WarehousePackageversionMapper {
    int insert(WarehousePackageversionWithBLOBs record);

    int insertSelective(WarehousePackageversionWithBLOBs record);
}