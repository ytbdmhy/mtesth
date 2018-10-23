package mtesth.api.log.dao;

import mtesth.api.log.model.PackageAndroidDownloadLogHistory;

public interface PackageAndroidDownloadLogHistoryMapper {
    int insert(PackageAndroidDownloadLogHistory record);

    int insertSelective(PackageAndroidDownloadLogHistory record);
}