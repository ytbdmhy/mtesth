package mtesth.api.content.dao;

import mtesth.api.content.model.InformationClass;

public interface InformationClassMapper {
    int insert(InformationClass record);

    int insertSelective(InformationClass record);
}