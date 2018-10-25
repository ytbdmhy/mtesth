package mtesth.base.utils;

import mtesth.base.constants.Constant;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 简易token工具类
 * 
 * @author Daniel
 */
public class SimpleTokenUtil {

	/**
	 * 校验token
	 * 
	 * @param inputToken
	 *            输入的token
	 * @param obj
	 *            入参对象
	 * @param secreyKey
	 *            密钥
	 * @return
	 * @author Daniel
	 */
	public static boolean checkToken(String inputToken, Object obj, String functionCode, String secreyKey) {
		if (inputToken != null && !"".equals(inputToken) && obj != null && secreyKey != null && !"".equals(secreyKey)) {
			String rightToken = buildToken(obj, functionCode, secreyKey);
			if (inputToken.equals(rightToken)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 构建token
	 * 
	 * @param obj
	 * @param secreyKey
	 * @return
	 * @author Daniel
	 */
	public static String buildToken(Object obj, String functionCode, String secreyKey) {
		String paramStr = buildParamStr(obj);
		return Md5Util.encodeString(paramStr + functionCode + "&" + secreyKey);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static String buildParamStr(Object obj) {
		StringBuilder str = new StringBuilder();
		Map<String, Object> oMap = null;
		if (obj instanceof Map) {
			oMap = (Map) obj;
		} else {
			oMap = MapUtil.objectToMap(obj);
		}
		if (oMap != null && oMap.size() > 0) {
			Map<String, Object> paramMap = new TreeMap<String, Object>();
			paramMap.putAll(oMap);
			for (Entry<String, Object> entry : paramMap.entrySet()) {
				String key = entry.getKey();
				Object value = entry.getValue();
				if (!Constant.ACCESS_TOKEN.equalsIgnoreCase(key)) {
					if (value != null && !"".equals(value.toString().trim()) && !"null".equals(value.toString())) {
						str.append(key);
						str.append("=");
						str.append(value.toString());
						// try {
						// str.append(java.net.URLDecoder.decode(value.toString(),
						// "UTF-8"));
						// } catch (UnsupportedEncodingException e) {
						// e.printStackTrace();
						// }
						str.append("&");
					}
				}
			}
		}
		return str.toString();
	}
}
