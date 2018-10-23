package mtesth.api.log.dao;

import mtesth.api.log.model.PackageAndroidDownloadLog;

public interface PackageAndroidDownloadLogMapper {
    int insert(PackageAndroidDownloadLog record);

    int insertSelective(PackageAndroidDownloadLog record);
}