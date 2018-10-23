package mtesth.api.content.dao;

import mtesth.api.content.model.DjangoContentType;

public interface DjangoContentTypeMapper {
    int insert(DjangoContentType record);

    int insertSelective(DjangoContentType record);
}