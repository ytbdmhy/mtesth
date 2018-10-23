package mtesth.api.common.dao;

import mtesth.api.common.model.NginxCacheKey;

public interface NginxCacheKeyMapper {
    int insert(NginxCacheKey record);

    int insertSelective(NginxCacheKey record);
}