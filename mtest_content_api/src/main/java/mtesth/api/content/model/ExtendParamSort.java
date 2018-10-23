package mtesth.api.content.model;

import java.util.Date;

public class ExtendParamSort {
    private Integer id;

    private String paramSort;

    private String paramName;

    private String paramTypeEnum;

    private String status;

    private Integer isDelete;

    private Date createDatetime;

    private Date updateDatetime;

    private Integer ordering;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParamSort() {
        return paramSort;
    }

    public void setParamSort(String paramSort) {
        this.paramSort = paramSort == null ? null : paramSort.trim();
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getParamTypeEnum() {
        return paramTypeEnum;
    }

    public void setParamTypeEnum(String paramTypeEnum) {
        this.paramTypeEnum = paramTypeEnum == null ? null : paramTypeEnum.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }
}