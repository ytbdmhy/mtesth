package mtesth.api.content.dao;

import mtesth.api.content.model.TaxonomyTopicalitem;

public interface TaxonomyTopicalitemMapper {
    int insert(TaxonomyTopicalitem record);

    int insertSelective(TaxonomyTopicalitem record);
}