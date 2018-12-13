package mtesth.base.constants;

import javax.net.ssl.SNIHostName;

/**
 * Created by Administrator on 2018/10/25.
 */
public class Constant {

    // 系统参数分为以下3块：
    // 1.客户端每次请求API时从header中携带的设备相关的参数，不能影响缓存策略！；
    public static final String DEVICE_NO = "device_no";
    public static final String OS_VERSION = "os_version";
    public static final String CHANNEL_CODE = "channel_code";
    public static final String CLIENT_BUNDLE_ID = "client_bundle_id";
    public static final String CLIENT_VERSION_NAME = "client_version_name";
    public static final String CLIENT_VERSION_CODE = "client_version_code";
    public static final String CLIENT_CHANNEL_NAME = "client_channel_name";
    public static final String CLIENT_CPU_ARCHITECTURE = "client_cpu_architecture"; // 客户端CPU架构
    public static final String USER_TOKEN = "user_token";
    public static final String PUSH_DEVICE_ID = "push_device_id"; // 极光推送设备标识（客户端生成）

    // 2.客户端每次请求API时与业务参数一起传递的参数：
    public static final String API_VERSION = "api_version";
    public static final String API_KEY = "api_key";
    public static final String API_SIGN = "api_sign";

    // 3.服务端收集整理的参数：
    public static final String API_CODE = "api_code";
    public static final String REQUEST_IP = "request_ip";
    public static final String REQUEST_TIMESTAMP = "request_timestamp";
    public static final String USER_AGENT = "user_agent";
    public static final String CURRENT_USER_ID = "current_user_id";

    // 常量
    public static final String INNER_API_KEY = "innerApiKey";
    public static final String INNER_API_SIGN = "innerApiSign";
    public static final String X_CLIENT_EVENT = "X-Client-Event";
    public static final String X_HASH_IP = "X-Hash-Ip";
    public static final String DATA = "data";
    public static final String PAGE = "page";
    public static final String PAGE_SIZE = "pageSize";
    public static final int CLIENT_PAGE_SIZE = 10;
    public static final int BACKEND_PAGE_SIZE = 20;

    public static final String COOKIE_KEY_USER_TOKEN = "user_token";
    public static final String SESSION_KEY_USER = "current_user";

    public static final String JUST_NEED_RESULT = "justNeedResult";
    public static final String DEFAULT_ACCESS_TOKEN = "innerToken";
    public static final String ACCESS_TOKEN = "token";

    public static final String ANDROID_STANDARD_CATEGORY = "android_standard_category";
    public static final String IOS_STANDARD_CATEGORY = "ios_standard_category";
    public static final String PC_STANDARD_CATEGORY = "pc_standard_category";

    public static final String android_backend = "android_backend";
    public static final String innerToken = "innerToken";

    public static final String STATUS_PUBLISHED = "published";
    public static final String STATUS_UNPUBLISHED = "unpublished";
    public static final String STATUS_DRAFT = "draft";

    public static final Short VIDEO_PICTYPE_BIGCOVER = 1;
    public static final Short VIDEO_PICTYPE_SMALLCOVER = 2;
    public static final Short VIDEO_PICTYPE_NORMALCOVER = 3;
    public static final Short VIDEO_PICTYPE_SCREENSHOT = 4;

    public static final String CATEGORY_FLAG_STANDARD = "standard";

    public static final String REDIS_KEY_CLEAN_NGINX_CACHE = "redis_key_clean_nginx_cache";

    /**
     * 资源类型为视频
     */
    public static final Short RESTYPE_VIDEO = 1;
    /**
     * 资源类型为游戏
     */
    public static final Short RESTYPE_APP = 2;

    public static final Short SELECTIONSECTION_STATUS_ENABLE = 1;
    public static final Short SELECTIONSECTION_STATUS_DISABLE = 0;
    public static final Short SELECTIONSECTION_STATUS_DELETED = 2;

    public static final String SETTING_COMMENT_STOPWORDS = "GC_GUILD_FORBIDDEN_WORDS";

    /**
     * 消息回复类型为：帖子评论
     */
    public static final Short REPLYTYPE_TOPICCOMMENT = 1;
    /**
     * 消息回复类型为：帖子评论的回复
     */
    public static final Short REPLYTYPE_COMMENTREPLY = 2;

    /**
     * 普通帖子（图片）类型
     */
    public static final Integer TOPIC_RESTYPE_COMMON = 1;
    /**
     * 视频帖子类型
     */
    public static final Integer TOPIC_RESTYPE_VIDEO = 2;
}
