package mtesth.api.common.model;

import java.util.Date;

public class ClientappClientpackageversion {
    private Integer id;

    private String icon;

    private String cover;

    private String packageName;

    private String download;

    private Integer downloadSize;

    private Integer downloadCount;

    private String versionName;

    private Integer versionCode;

    private String summary;

    private String status;

    private Date releasedDatetime;

    private Date createdDatetime;

    private Date updatedDatetime;

    private Integer siteId;

    private Integer resourcesCount;

    private String workspace;

    private Integer mustUpdateFlag;

    private String clientCpuArchitecture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download == null ? null : download.trim();
    }

    public Integer getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Integer downloadSize) {
        this.downloadSize = downloadSize;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
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

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getResourcesCount() {
        return resourcesCount;
    }

    public void setResourcesCount(Integer resourcesCount) {
        this.resourcesCount = resourcesCount;
    }

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace == null ? null : workspace.trim();
    }

    public Integer getMustUpdateFlag() {
        return mustUpdateFlag;
    }

    public void setMustUpdateFlag(Integer mustUpdateFlag) {
        this.mustUpdateFlag = mustUpdateFlag;
    }

    public String getClientCpuArchitecture() {
        return clientCpuArchitecture;
    }

    public void setClientCpuArchitecture(String clientCpuArchitecture) {
        this.clientCpuArchitecture = clientCpuArchitecture == null ? null : clientCpuArchitecture.trim();
    }
}