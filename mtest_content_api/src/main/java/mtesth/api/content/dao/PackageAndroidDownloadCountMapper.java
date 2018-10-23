package mtesth.api.content.dao;

import mtesth.api.content.model.PackageAndroidDownloadCount;

public interface PackageAndroidDownloadCountMapper {
    int insert(PackageAndroidDownloadCount record);

    int insertSelective(PackageAndroidDownloadCount record);
}