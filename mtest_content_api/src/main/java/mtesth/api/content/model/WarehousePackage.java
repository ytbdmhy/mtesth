package mtesth.api.content.model;

import java.util.Date;

public class WarehousePackage {
    private Integer id;

    private String title;

    private String packageName;

    private String platformType;

    private String summary;

    private String tagsText;

    private String status;

    private Integer downloadCount;

    private Integer siteId;

    private Integer rootCategoryId;

    private Integer latestVersionId;

    private Integer deleteFlag;

    private Integer standardCategoryId;

    private String standardCategoryNames;

    private Integer downloadClickCount;

    private Integer downloadCompleteCount;

    private Date releasedDatetime;

    private Date createdDatetime;

    private Date updatedDatetime;

    private Date lastModified;

    private Integer iosPackageId;

    private String keyword;

    private String descriptionSeo;

    private Integer authorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getTagsText() {
        return tagsText;
    }

    public void setTagsText(String tagsText) {
        this.tagsText = tagsText == null ? null : tagsText.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public Integer getRootCategoryId() {
        return rootCategoryId;
    }

    public void setRootCategoryId(Integer rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    public Integer getLatestVersionId() {
        return latestVersionId;
    }

    public void setLatestVersionId(Integer latestVersionId) {
        this.latestVersionId = latestVersionId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStandardCategoryId() {
        return standardCategoryId;
    }

    public void setStandardCategoryId(Integer standardCategoryId) {
        this.standardCategoryId = standardCategoryId;
    }

    public String getStandardCategoryNames() {
        return standardCategoryNames;
    }

    public void setStandardCategoryNames(String standardCategoryNames) {
        this.standardCategoryNames = standardCategoryNames == null ? null : standardCategoryNames.trim();
    }

    public Integer getDownloadClickCount() {
        return downloadClickCount;
    }

    public void setDownloadClickCount(Integer downloadClickCount) {
        this.downloadClickCount = downloadClickCount;
    }

    public Integer getDownloadCompleteCount() {
        return downloadCompleteCount;
    }

    public void setDownloadCompleteCount(Integer downloadCompleteCount) {
        this.downloadCompleteCount = downloadCompleteCount;
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

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Integer getIosPackageId() {
        return iosPackageId;
    }

    public void setIosPackageId(Integer iosPackageId) {
        this.iosPackageId = iosPackageId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getDescriptionSeo() {
        return descriptionSeo;
    }

    public void setDescriptionSeo(String descriptionSeo) {
        this.descriptionSeo = descriptionSeo == null ? null : descriptionSeo.trim();
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}