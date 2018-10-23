package mtesth.api.content.dao;

import mtesth.api.content.model.WarehouseAuthor;

public interface WarehouseAuthorMapper {
    int insert(WarehouseAuthor record);

    int insertSelective(WarehouseAuthor record);
}