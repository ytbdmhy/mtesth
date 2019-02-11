package mtesth.base.web;

import mtesth.base.annotations.ApiMethod;
import mtesth.base.annotations.ApiService;
import mtesth.base.enums.ApiMethodEnum;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019-02-11.
 */
public class SpringBeanProxy {

    private static ApplicationContext applicationContext;

    private static Map<String, Object[]> API_METHOD_MAP = new HashMap<String, Object[]>();

    /**
     * api类目
     */
    private static Map<String, String> apiCodeCatalogMap = new LinkedHashMap<String, String>();

    /**
     * api列表
     */
    private static Map<String, Map<String, String>> apiCodeListMap = new LinkedHashMap<String, Map<String, String>>();

    /**
     * api参数
     */
    private static Map<String, Map<String, String>> apiCodeParamMap = new LinkedHashMap<String, Map<String, String>>();

    public synchronized static void setAppilcationContext(ApplicationContext arg0) {
        applicationContext = arg0;

        Map<String, Object> tempMap = applicationContext.getBeansWithAnnotation(ApiService.class);
        if (tempMap != null && tempMap.size() > 0) {
            for (Map.Entry<String, Object> entry : tempMap.entrySet()) {
                String beanName = entry.getKey();
                Object bean = entry.getValue();
                ApiService beanFc = bean.getClass().getAnnotation(ApiService.class);
                if (beanFc != null) {
                    apiCodeCatalogMap.put(beanName, beanFc.descript());

                    Method[] methodArr = bean.getClass().getDeclaredMethods();
                    if (methodArr != null && methodArr.length > 0) {
                        Map<String, String> methodFunctionCodeMap = new LinkedHashMap<String, String>();
                        for (Method method : methodArr) {
                            ApiMethod methodFc = method.getAnnotation(ApiMethod.class);

                        }
                    }
                }
            }
        }
    }
}
