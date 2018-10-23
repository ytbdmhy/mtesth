package mtesth.api.content.dao;

import mtesth.api.content.model.SelectionSectionPackage;

public interface SelectionSectionPackageMapper {
    int insert(SelectionSectionPackage record);

    int insertSelective(SelectionSectionPackage record);
}