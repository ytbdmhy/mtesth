package mtesth.api.content.model;

import java.util.Date;

public class NewsContent {
    private Integer id;

    private String newsTitle;

    private String newsSummary;

    private String newsCover;

    private String status;

    private Integer isTop;

    private Date topDatetime;

    private Date releasedDatetime;

    private Date createdDatetime;

    private Date updatedDatetime;

    private Integer visitsnum;

    private Integer isDelete;

    private String bgColor;

    private String source;

    private Integer packageId;

    private String packageTitle;

    private String newsContentType;

    private Integer recommenedInNewgame;

    private Integer realVisitsnum;

    private Integer siteId;

    private String tagsText;

    private String seoKeywords;

    private String newsCoverAlt;

    private String newsContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsSummary() {
        return newsSummary;
    }

    public void setNewsSummary(String newsSummary) {
        this.newsSummary = newsSummary == null ? null : newsSummary.trim();
    }

    public String getNewsCover() {
        return newsCover;
    }

    public void setNewsCover(String newsCover) {
        this.newsCover = newsCover == null ? null : newsCover.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Date getTopDatetime() {
        return topDatetime;
    }

    public void setTopDatetime(Date topDatetime) {
        this.topDatetime = topDatetime;
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

    public Integer getVisitsnum() {
        return visitsnum;
    }

    public void setVisitsnum(Integer visitsnum) {
        this.visitsnum = visitsnum;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor == null ? null : bgColor.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPackageTitle() {
        return packageTitle;
    }

    public void setPackageTitle(String packageTitle) {
        this.packageTitle = packageTitle == null ? null : packageTitle.trim();
    }

    public String getNewsContentType() {
        return newsContentType;
    }

    public void setNewsContentType(String newsContentType) {
        this.newsContentType = newsContentType == null ? null : newsContentType.trim();
    }

    public Integer getRecommenedInNewgame() {
        return recommenedInNewgame;
    }

    public void setRecommenedInNewgame(Integer recommenedInNewgame) {
        this.recommenedInNewgame = recommenedInNewgame;
    }

    public Integer getRealVisitsnum() {
        return realVisitsnum;
    }

    public void setRealVisitsnum(Integer realVisitsnum) {
        this.realVisitsnum = realVisitsnum;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getTagsText() {
        return tagsText;
    }

    public void setTagsText(String tagsText) {
        this.tagsText = tagsText == null ? null : tagsText.trim();
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    public String getNewsCoverAlt() {
        return newsCoverAlt;
    }

    public void setNewsCoverAlt(String newsCoverAlt) {
        this.newsCoverAlt = newsCoverAlt == null ? null : newsCoverAlt.trim();
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }
}