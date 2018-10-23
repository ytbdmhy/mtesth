package mtesth.api.content.model;

import java.util.Date;

public class DailyNewsLookCnt {
    private Integer newsId;

    private String newsContentType;

    private Date createDate;

    private Integer lookCnt;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsContentType() {
        return newsContentType;
    }

    public void setNewsContentType(String newsContentType) {
        this.newsContentType = newsContentType == null ? null : newsContentType.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getLookCnt() {
        return lookCnt;
    }

    public void setLookCnt(Integer lookCnt) {
        this.lookCnt = lookCnt;
    }
}