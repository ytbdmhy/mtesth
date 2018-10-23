package mtesth.api.content.dao;

import mtesth.api.content.model.WarehousePackageCategories;

public interface WarehousePackageCategoriesMapper {
    int insert(WarehousePackageCategories record);

    int insertSelective(WarehousePackageCategories record);
}