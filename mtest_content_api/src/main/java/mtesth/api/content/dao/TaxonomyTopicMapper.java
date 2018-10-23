package mtesth.api.content.dao;

import mtesth.api.content.model.TaxonomyTopic;

public interface TaxonomyTopicMapper {
    int insert(TaxonomyTopic record);

    int insertSelective(TaxonomyTopic record);
}