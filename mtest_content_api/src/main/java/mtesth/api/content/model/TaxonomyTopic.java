package mtesth.api.content.model;

import java.util.Date;

public class TaxonomyTopic {
    private Integer id;

    private String name;

    private String slug;

    private Integer ordering;

    private Integer parentId;

    private String icon;

    private String cover;

    private String summary;

    private String status;

    private Date releasedDatetime;

    private Date updatedDatetime;

    private Date createdDatetime;

    private Integer mpttLft;

    private Integer mpttRgt;

    private Integer treeId;

    private Integer mpttLevel;

    private Byte isHidden;

    private Integer siteId;

    private Integer resourcesCount;

    private String contentType;

    private String limitChannel;

    private Integer isIndex;

    private String action;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public Date getUpdatedDatetime() {
        return updatedDatetime;
    }

    public void setUpdatedDatetime(Date updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Integer getMpttLft() {
        return mpttLft;
    }

    public void setMpttLft(Integer mpttLft) {
        this.mpttLft = mpttLft;
    }

    public Integer getMpttRgt() {
        return mpttRgt;
    }

    public void setMpttRgt(Integer mpttRgt) {
        this.mpttRgt = mpttRgt;
    }

    public Integer getTreeId() {
        return treeId;
    }

    public void setTreeId(Integer treeId) {
        this.treeId = treeId;
    }

    public Integer getMpttLevel() {
        return mpttLevel;
    }

    public void setMpttLevel(Integer mpttLevel) {
        this.mpttLevel = mpttLevel;
    }

    public Byte getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Byte isHidden) {
        this.isHidden = isHidden;
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

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    public String getLimitChannel() {
        return limitChannel;
    }

    public void setLimitChannel(String limitChannel) {
        this.limitChannel = limitChannel == null ? null : limitChannel.trim();
    }

    public Integer getIsIndex() {
        return isIndex;
    }

    public void setIsIndex(Integer isIndex) {
        this.isIndex = isIndex;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }
}