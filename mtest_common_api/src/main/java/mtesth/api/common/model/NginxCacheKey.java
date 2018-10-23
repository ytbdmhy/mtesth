package mtesth.api.common.model;

import java.util.Date;

public class NginxCacheKey {
    private Integer id;

    private String name;

    private String cacheType;

    private String cacheKey;

    private Date createTime;

    private String cacheSite;

    private String nginxServer;

    private String typeValue;

    private String codes;

    private String cacheParam;

    private Integer deleteFlag;

    private Integer clearFlag;

    private Integer refreshFlag;

    private String filePath;

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

    public String getCacheType() {
        return cacheType;
    }

    public void setCacheType(String cacheType) {
        this.cacheType = cacheType == null ? null : cacheType.trim();
    }

    public String getCacheKey() {
        return cacheKey;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey == null ? null : cacheKey.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCacheSite() {
        return cacheSite;
    }

    public void setCacheSite(String cacheSite) {
        this.cacheSite = cacheSite == null ? null : cacheSite.trim();
    }

    public String getNginxServer() {
        return nginxServer;
    }

    public void setNginxServer(String nginxServer) {
        this.nginxServer = nginxServer == null ? null : nginxServer.trim();
    }

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue == null ? null : typeValue.trim();
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes == null ? null : codes.trim();
    }

    public String getCacheParam() {
        return cacheParam;
    }

    public void setCacheParam(String cacheParam) {
        this.cacheParam = cacheParam == null ? null : cacheParam.trim();
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getClearFlag() {
        return clearFlag;
    }

    public void setClearFlag(Integer clearFlag) {
        this.clearFlag = clearFlag;
    }

    public Integer getRefreshFlag() {
        return refreshFlag;
    }

    public void setRefreshFlag(Integer refreshFlag) {
        this.refreshFlag = refreshFlag;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }
}