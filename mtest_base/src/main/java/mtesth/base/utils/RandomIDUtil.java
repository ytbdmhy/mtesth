package mtesth.base.utils;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public final class RandomIDUtil {
	/**
	 * 生成唯一编号
	 * 
	 * @return
	 */
	public static String getNewUUID() {
		String uuid = java.util.UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}

	public static long getRandom(long seed) {
		long random = (long) (Math.random() * seed);
		return random;
	}

	public static long getRandom(long min, long max) {
		return Math.round(Math.random() * (max - min) + min);
	}

	public static String getNumber(int length) {
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < length; i++) {
			str.append(getRandom(0, 9));
		}
		return str.toString();
	}

	public static String getCharacterAndNumber(int length, boolean lowerCaseChar) {
		StringBuffer str = new StringBuffer();
		Random random = new Random();
		int choice = 97;
		for (int i = 0; i < length; i++) {
			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num"; // 输出字母还是数字
			if ("char".equalsIgnoreCase(charOrNum)) {// 字符串
				if (!lowerCaseChar) {
					choice = random.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写字母还是小写字母
				}
				str.append((char) (choice + random.nextInt(26)));
			} else if ("num".equalsIgnoreCase(charOrNum)) { // 数字
				str.append(String.valueOf(random.nextInt(10)));
			}
		}
		return str.toString();
	}

	public static String getNumberId() {
		String uuid = DateTimeUtil.formatDateTime(new Date(), DateTimeUtil.DATETIME_PATTERN_LONG2) + String.valueOf(getRandom(99999999));
		return uuid;
	}

	public static void main(String[] a) {
		// for (int i = 0; i < 10; i++)
		// System.out.println(getRandom(1));
		// // System.out.println(getRandom(1));

		// System.out.println(getNumber(6));

		Set<String> set = new HashSet<String>();
		for (int i = 0; i < 1000000; i++) {
			String id = getNumberId();
			set.add(id);
			System.out.println(id);
		}
		System.out.println(set.size());
	}
}
