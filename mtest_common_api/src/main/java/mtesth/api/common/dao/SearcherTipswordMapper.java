package mtesth.api.common.dao;

import mtesth.api.common.model.SearcherTipsword;

public interface SearcherTipswordMapper {
    int insert(SearcherTipsword record);

    int insertSelective(SearcherTipsword record);
}