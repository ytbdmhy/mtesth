package mtesth.api.content.model;

import java.util.Date;

public class ExtendParamSortCode {
    private Integer id;

    private Integer paramSortId;

    private Integer objectId;

    private String paramCodeValue;

    private Date updateDatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParamSortId() {
        return paramSortId;
    }

    public void setParamSortId(Integer paramSortId) {
        this.paramSortId = paramSortId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getParamCodeValue() {
        return paramCodeValue;
    }

    public void setParamCodeValue(String paramCodeValue) {
        this.paramCodeValue = paramCodeValue == null ? null : paramCodeValue.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}