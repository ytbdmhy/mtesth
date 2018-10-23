package mtesth.api.content.model;

import java.util.Date;

public class WarehousePackageversion {
    private Integer id;

    private Integer packageId;

    private String versionName;

    private Integer versionCode;

    private String status;

    private Date releasedDatetime;

    private Date createdDatetime;

    private Date updatedDatetime;

    private String icon;

    private String download;

    private String cover;

    private Integer downloadCount;

    private Integer siteId;

    private String subtitle;

    private String summary;

    private Integer downloadSize;

    private String downloadMd5;

    private String tagsText;

    private String workspace;

    private Integer resourcesCount;

    private Integer commentsCount;

    private Integer deleteFlag;

    private String chineseName;

    private String englishName;

    private String propertyFlag;

    private Date propertyFlagExpiry;

    private String updatesLog;

    private String iosPackageSize;

    private Float starsAverage;

    private String allocationPlan;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getReleasedDatetime() {
        return releasedDatetime;
    }

    public void setReleasedDatetime(Date releasedDatetime) {
        this.releasedDatetime = releasedDatetime;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Date getUpdatedDatetime() {
        return updatedDatetime;
    }

    public void setUpdatedDatetime(Date updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download == null ? null : download.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Integer downloadSize) {
        this.downloadSize = downloadSize;
    }

    public String getDownloadMd5() {
        return downloadMd5;
    }

    public void setDownloadMd5(String downloadMd5) {
        this.downloadMd5 = downloadMd5 == null ? null : downloadMd5.trim();
    }

    public String getTagsText() {
        return tagsText;
    }

    public void setTagsText(String tagsText) {
        this.tagsText = tagsText == null ? null : tagsText.trim();
    }

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace == null ? null : workspace.trim();
    }

    public Integer getResourcesCount() {
        return resourcesCount;
    }

    public void setResourcesCount(Integer resourcesCount) {
        this.resourcesCount = resourcesCount;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getPropertyFlag() {
        return propertyFlag;
    }

    public void setPropertyFlag(String propertyFlag) {
        this.propertyFlag = propertyFlag == null ? null : propertyFlag.trim();
    }

    public Date getPropertyFlagExpiry() {
        return propertyFlagExpiry;
    }

    public void setPropertyFlagExpiry(Date propertyFlagExpiry) {
        this.propertyFlagExpiry = propertyFlagExpiry;
    }

    public String getUpdatesLog() {
        return updatesLog;
    }

    public void setUpdatesLog(String updatesLog) {
        this.updatesLog = updatesLog == null ? null : updatesLog.trim();
    }

    public String getIosPackageSize() {
        return iosPackageSize;
    }

    public void setIosPackageSize(String iosPackageSize) {
        this.iosPackageSize = iosPackageSize == null ? null : iosPackageSize.trim();
    }

    public Float getStarsAverage() {
        return starsAverage;
    }

    public void setStarsAverage(Float starsAverage) {
        this.starsAverage = starsAverage;
    }

    public String getAllocationPlan() {
        return allocationPlan;
    }

    public void setAllocationPlan(String allocationPlan) {
        this.allocationPlan = allocationPlan == null ? null : allocationPlan.trim();
    }
}