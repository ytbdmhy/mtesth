package mtesth.api.content.dao;

import mtesth.api.content.model.SelectionSectionVideo;

public interface SelectionSectionVideoMapper {
    int insert(SelectionSectionVideo record);

    int insertSelective(SelectionSectionVideo record);
}