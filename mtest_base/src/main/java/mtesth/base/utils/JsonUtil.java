package mtesth.base.utils;

/**
 * Created by Administrator on 2019-01-13.
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * 实现json字符串与java对象之间的互相转换等功能
 */
public class JsonUtil {

    /**
     * 将json字符串转换成java对象（支持泛型）
     */
    public static <T> T jsonToObject(String json, Type type) {
        T obj = null;
        try {
            obj = new Gson().fromJson(json, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    /**
     * 将java对象转换成json字符串
     */
    public static String objectToJson(Object obj) {
        return objectToJson(obj, null);
    }

    /**
     * 将java对象转换成json字符串（支持泛型）
     */
    public static String objectToJson(Object obj, Type type) {
        return objectToJson(obj, type, null);
    }

    public static String objectToJson(Object obj, Type type, String dateFormat) {
        String json = null;
        try {
            GsonBuilder gb = new GsonBuilder().serializeNulls();
            if (dateFormat != null && !"".equals(dateFormat)) {
                gb.setDateFormat(dateFormat);
            }
            if (type != null) {
                json = gb.create().toJson(obj, type);
            } else {
                json = gb.create().toJson(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
