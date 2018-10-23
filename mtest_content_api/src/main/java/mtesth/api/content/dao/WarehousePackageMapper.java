package mtesth.api.content.dao;

import mtesth.api.content.model.WarehousePackageWithBLOBs;

public interface WarehousePackageMapper {
    int insert(WarehousePackageWithBLOBs record);

    int insertSelective(WarehousePackageWithBLOBs record);
}