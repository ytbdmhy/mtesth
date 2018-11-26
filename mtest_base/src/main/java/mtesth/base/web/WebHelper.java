package mtesth.base.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;

/**
 * Created by Administrator on 2018/11/26.
 */
public class WebHelper {

    public static void sendRedirect(HttpServletResponse response, String url) throws IOException {
        response.sendRedirect(response.encodeRedirectURL(url));
    }

    @SuppressWarnings("unchecked")
    public static String getCurrRequestUrl(HttpServletRequest request) throws UnsupportedEncodingException {
        StringBuffer currRequestUrl = request.getRequestURL();
        Enumeration<String> parameterNames = request.getParameterNames();
    }
}
