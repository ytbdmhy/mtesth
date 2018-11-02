package mtesth.api.common.apiservice;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;
import mtesth.api.common.service.JpushService;
import mtesth.api.common.service.impl.JpushServiceImpl;
import org.springframework.stereotype.Controller;

import java.util.*;

/**
 * Created by Administrator on 2018/11/1.
 */
@Controller
public class JpushTest {

    public static void main(String[] args) {
        Map<String,String> parm = new HashMap<String, String>();
        parm.put("id","111");
        parm.put("title","tttttitle");
        parm.put("msg","所有人JPush测试haoyun");
//        pushMsg(parm);
        jpushIOS(parm);
    }

    public static void pushMsg(Map<String,String> parm) {
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
                .setNotification(Notification.android(parm.get("msg"), parm.get("title"), parm))//发送内容,这里不要盲目复制粘贴,这里是我从controller层中拿过来的参数)
                .setOptions(Options.newBuilder().setApnsProduction(false).build())//这里是指定开发环境,不用设置也没关系
                .setMessage(Message.content(parm.get("msg")))//自定义信息
                .build();
        System.out.println("payload:" + payload.toJSON().toString());
        try {
            PushResult pu = jpushClient.sendPush(payload);
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }

    //极光推送>>ios
    //Map<String, String> parm是我自己传过来的参数,同学们可以自定义参数
    public static  void jpushIOS(Map<String, String> parm) {
        // 设置好账号的app_key和masterSecret是必须的
        String appKey = "b146833d1a5d4c9a83b145e5";
        String masterSecret = "8fbb0e146701c2ee21065a8a";
        List<String> list = new ArrayList<String>();
        list.add("100760");

        //创建JPushClient
        JPushClient jpushClient = new JPushClient(masterSecret, appKey);
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.ios())//ios平台的用户
                .setAudience(Audience.alias(list))//所有用户
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(IosNotification.newBuilder()
                                .setAlert(parm.get("msg"))
                                .setBadge(+1)
                                .setSound("happy")//这里是设置提示音(更多可以去官网看看)
                                .addExtra("from","JPush")
                                .build())
                        .build())
                .setOptions(Options.newBuilder().setApnsProduction(false).build())
                .setMessage(Message.newBuilder().setMsgContent(parm.get("msg")).addExtras(parm).build())//自定义信息
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
