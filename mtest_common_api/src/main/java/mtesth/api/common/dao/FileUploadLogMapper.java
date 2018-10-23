package mtesth.api.common.dao;

import mtesth.api.common.model.FileUploadLog;

public interface FileUploadLogMapper {
    int insert(FileUploadLog record);

    int insertSelective(FileUploadLog record);
}