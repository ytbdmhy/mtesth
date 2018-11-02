package mtesth.api.common.service;

import com.hgv.base.dto.ApiResponse;

import java.util.Map;

/**
 * Created by Administrator on 2018/11/1.
 */
public interface JpushService {

    void pushMsg(Map<String,String> parm);
}
