package mtesth.api.content.dao;

import mtesth.api.content.model.DailyNewsLookCnt;

public interface DailyNewsLookCntMapper {
    int insert(DailyNewsLookCnt record);

    int insertSelective(DailyNewsLookCnt record);
}