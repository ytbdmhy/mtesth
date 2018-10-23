package mtesth.api.content.dao;

import mtesth.api.content.model.SelectionSection;

public interface SelectionSectionMapper {
    int insert(SelectionSection record);

    int insertSelective(SelectionSection record);
}