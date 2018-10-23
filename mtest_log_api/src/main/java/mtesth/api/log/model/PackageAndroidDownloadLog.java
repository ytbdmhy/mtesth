package mtesth.api.log.model;

import java.util.Date;

public class PackageAndroidDownloadLog {
    private Integer id;

    private Integer packageId;

    private String packageName;

    private String packageTitle;

    private Integer rootCategoryId;

    private String rootCategorySlug;

    private String rootCatagoryName;

    private Integer starsAverage;

    private String downloadUrl;

    private Integer standardCatagoryId;

    private String standardCatagoryNames;

    private Integer versionId;

    private String versionName;

    private Integer versionCode;

    private String platformType;

    private String icon;

    private Integer sourceSiteId;

    private String sourcePlatformCode;

    private String sourceFunctionCode;

    private Date createTime;

    private String ip;

    private String userAgent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getPackageTitle() {
        return packageTitle;
    }

    public void setPackageTitle(String packageTitle) {
        this.packageTitle = packageTitle == null ? null : packageTitle.trim();
    }

    public Integer getRootCategoryId() {
        return rootCategoryId;
    }

    public void setRootCategoryId(Integer rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    public String getRootCategorySlug() {
        return rootCategorySlug;
    }

    public void setRootCategorySlug(String rootCategorySlug) {
        this.rootCategorySlug = rootCategorySlug == null ? null : rootCategorySlug.trim();
    }

    public String getRootCatagoryName() {
        return rootCatagoryName;
    }

    public void setRootCatagoryName(String rootCatagoryName) {
        this.rootCatagoryName = rootCatagoryName == null ? null : rootCatagoryName.trim();
    }

    public Integer getStarsAverage() {
        return starsAverage;
    }

    public void setStarsAverage(Integer starsAverage) {
        this.starsAverage = starsAverage;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }

    public Integer getStandardCatagoryId() {
        return standardCatagoryId;
    }

    public void setStandardCatagoryId(Integer standardCatagoryId) {
        this.standardCatagoryId = standardCatagoryId;
    }

    public String getStandardCatagoryNames() {
        return standardCatagoryNames;
    }

    public void setStandardCatagoryNames(String standardCatagoryNames) {
        this.standardCatagoryNames = standardCatagoryNames == null ? null : standardCatagoryNames.trim();
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getSourceSiteId() {
        return sourceSiteId;
    }

    public void setSourceSiteId(Integer sourceSiteId) {
        this.sourceSiteId = sourceSiteId;
    }

    public String getSourcePlatformCode() {
        return sourcePlatformCode;
    }

    public void setSourcePlatformCode(String sourcePlatformCode) {
        this.sourcePlatformCode = sourcePlatformCode == null ? null : sourcePlatformCode.trim();
    }

    public String getSourceFunctionCode() {
        return sourceFunctionCode;
    }

    public void setSourceFunctionCode(String sourceFunctionCode) {
        this.sourceFunctionCode = sourceFunctionCode == null ? null : sourceFunctionCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }
}