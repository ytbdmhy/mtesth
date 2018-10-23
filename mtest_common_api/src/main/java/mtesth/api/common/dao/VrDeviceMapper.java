package mtesth.api.common.dao;

import mtesth.api.common.model.VrDevice;

public interface VrDeviceMapper {
    int insert(VrDevice record);

    int insertSelective(VrDevice record);
}