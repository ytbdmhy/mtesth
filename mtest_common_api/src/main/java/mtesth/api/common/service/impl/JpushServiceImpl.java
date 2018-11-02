package mtesth.api.common.service.impl;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;
import com.hgv.base.dto.ApiResponse;
import com.hgv.base.enums.ApiMsgEnum;
import mtesth.api.common.service.JpushService;

import java.util.Map;

/**
 * Created by Administrator on 2018/11/1.
 */
public class JpushServiceImpl implements JpushService {

    @Override
    public void pushMsg(Map<String,String> parm) {
        //极光推送>>Android
        //Map<String, String> parm是我自己传过来的参数,同学们可以自定义参数

            // 设置好账号的app_key和masterSecret
            String appKey = "9f9266a5198cafe408496f57";
            String masterSecret = "0dd393a7c8680e78a67561fb";
            //创建JPushClient(极光推送的实例)
            JPushClient jpushClient = new JPushClient(masterSecret, appKey);
            //推送的关键,构造一个payload
            PushPayload payload = PushPayload.newBuilder()
                    .setPlatform(Platform.android())//指定android平台的用户
                    .setAudience(Audience.all())//你项目中的所有用户
                    .setNotification(Notification.android(parm.get("msg"), "title", parm))//发送内容,这里不要盲目复制粘贴,这里是我从controller层中拿过来的参数)
                    .setOptions(Options.newBuilder().setApnsProduction(false).build())//这里是指定开发环境,不用设置也没关系
                    .setMessage(Message.content(parm.get("msg")))//自定义信息
                    .build();

            try {
                PushResult pu = jpushClient.sendPush(payload);
            } catch (APIConnectionException e) {
                e.printStackTrace();
            } catch (APIRequestException e) {
                e.printStackTrace();
            }
    }
}
