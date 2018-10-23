package mtesth.api.content.dao;

import mtesth.api.content.model.TaxonomyCategory;

public interface TaxonomyCategoryMapper {
    int insert(TaxonomyCategory record);

    int insertSelective(TaxonomyCategory record);
}