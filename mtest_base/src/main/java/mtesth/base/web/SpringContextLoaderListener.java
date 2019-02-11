package mtesth.base.web;

import org.apache.log4j.Logger;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContextEvent;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Administrator on 2019-02-11.
 */
public class SpringContextLoaderListener extends ContextLoaderListener {
    private static final Logger log = Logger.getLogger(SpringContextLoaderListener.class);
    private static Map<String, String> appConfig = new HashMap<String, String>();

    @SuppressWarnings("unchecked")
    @Override
    public void contextInitialized(ServletContextEvent event) {
        super.contextInitialized(event);
        Enumeration<String> initParam = event.getServletContext().getInitParameterNames();
        if (initParam != null) {
            while (initParam.hasMoreElements()) {
                String key = initParam.nextElement();
                String value = event.getServletContext().getInitParameter(key);
                log.info("init app config key:" + key + ",value:" + value);
                appConfig.put(key, value);
            }
        }
        WebApplicationContext context = (WebApplicationContext) event.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        SpringBeanProxy.
    }
}
