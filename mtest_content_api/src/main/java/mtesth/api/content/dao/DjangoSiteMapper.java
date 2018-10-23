package mtesth.api.content.dao;

import mtesth.api.content.model.DjangoSite;

public interface DjangoSiteMapper {
    int insert(DjangoSite record);

    int insertSelective(DjangoSite record);
}