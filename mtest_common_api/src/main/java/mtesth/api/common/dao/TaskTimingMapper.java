package mtesth.api.common.dao;

import mtesth.api.common.model.TaskTiming;

public interface TaskTimingMapper {
    int insert(TaskTiming record);

    int insertSelective(TaskTiming record);
}