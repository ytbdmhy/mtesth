package mtesth.base.utils;

import mtesth.base.componets.SSLSocketFactoryEx;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.UnsupportedEncodingException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("deprecation")
public class HttpsUtil {

	/**
	 * HTTPS POST请求
	 * 
	 * @param url
	 * @param paramMap
	 * @return
	 * @author daniel
	 */
	public static String doHttpsPost(String url, Map<String, Object> paramMap, Map<String, Object> headerMap) {
		String retStr = null;
		HttpClient httpClient = getNewHttpClient();
		HttpParams params = httpClient.getParams();
		HttpConnectionParams.setConnectionTimeout(params, 15000);
		HttpConnectionParams.setSoTimeout(params, 15000);
		HttpPost httpPost = new HttpPost(url);
		ContentType contentType = null;
		if (headerMap != null) {
			for (Map.Entry<String, Object> entry : headerMap.entrySet()) {
				String key = entry.getKey();
				Object value = entry.getValue();
				httpPost.setHeader(key, value == null ? "" : value.toString());
				if ("Content-Type".equalsIgnoreCase(key) && value != null) {
					contentType = ContentType.create(value.toString());
				}
			}
		}
		if (paramMap != null) {
			HttpEntity httpEntity = null;
			if (contentType != null && ContentType.APPLICATION_JSON.getMimeType().equals(contentType.getMimeType())) {
				String json = JsonUtil.objectToJson(paramMap);
				httpEntity = new StringEntity(json, ContentType.APPLICATION_JSON);
			} else {
				List<NameValuePair> paramList = new ArrayList<NameValuePair>();
				for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
					String key = entry.getKey();
					Object value = entry.getValue();
					NameValuePair kv = new BasicNameValuePair(key, value == null ? "" : value.toString());
					paramList.add(kv);
				}
				try {
					httpEntity = new UrlEncodedFormEntity(paramList, "UTF-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			httpPost.setEntity(httpEntity);
		}
		HttpResponse httpResponse = null;
		int httpStatusCode = 0;
		try {
			httpResponse = httpClient.execute(httpPost);
			httpStatusCode = httpResponse.getStatusLine().getStatusCode();
			if (HttpStatus.SC_OK == httpStatusCode) {
				HttpEntity httpEntity = httpResponse.getEntity();
				if (httpEntity != null) {
					retStr = EntityUtils.toString(httpEntity, "UTF-8");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpClient.getConnectionManager().shutdown();
		}
		return retStr;
	}

	/**
	 * HTTPS GET请求
	 * 
	 * @param url
	 * @return
	 * @author daniel
	 */
	public static String doHttpsGet(String url) {
		String retStr = null;
		HttpClient httpClient = getNewHttpClient();
		HttpParams params = httpClient.getParams();
		HttpConnectionParams.setConnectionTimeout(params, 15000);
		HttpConnectionParams.setSoTimeout(params, 15000);
		HttpGet httpGet = new HttpGet(url);
		HttpResponse httpResponse = null;
		int httpStatusCode = 0;
		try {
			httpResponse = httpClient.execute(httpGet);
			httpStatusCode = httpResponse.getStatusLine().getStatusCode();
			if (HttpStatus.SC_OK == httpStatusCode) {
				HttpEntity httpEntity = httpResponse.getEntity();
				if (httpEntity != null) {
					retStr = EntityUtils.toString(httpEntity, "UTF-8");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpClient.getConnectionManager().shutdown();
		}
		return retStr;
	}

	public static HttpClient getNewHttpClient() {
		try {
			KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
			trustStore.load(null, null);

			SSLSocketFactory sf = new SSLSocketFactoryEx(trustStore);
			sf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

			HttpParams params = new BasicHttpParams();
			HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
			HttpProtocolParams.setContentCharset(params, HTTP.UTF_8);

			SchemeRegistry registry = new SchemeRegistry();
			registry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
			registry.register(new Scheme("https", sf, 443));

			ClientConnectionManager ccm = new ThreadSafeClientConnManager(params, registry);

			return new DefaultHttpClient(ccm, params);
		} catch (Exception e) {
			return new DefaultHttpClient();
		}
	}
}
