package mtesth.api.content.model;

public class TaxonomyCategory {
    private Integer id;

    private String name;

    private String slug;

    private String platformType;

    private Integer ordering;

    private Integer parentId;

    private String subtitle;

    private String icon;

    private Integer mpttLft;

    private Integer mpttRgt;

    private Integer treeId;

    private Integer mpttLevel;

    private Byte isHidden;

    private Integer siteId;

    private Integer resourcesCount;

    private Integer deleteFlag;

    private Integer isLeaf;

    private String categoryFlag;

    private Integer contentTypeId;

    private String contentObject;

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

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getCategoryFlag() {
        return categoryFlag;
    }

    public void setCategoryFlag(String categoryFlag) {
        this.categoryFlag = categoryFlag == null ? null : categoryFlag.trim();
    }

    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public String getContentObject() {
        return contentObject;
    }

    public void setContentObject(String contentObject) {
        this.contentObject = contentObject == null ? null : contentObject.trim();
    }
}