package mtesth.base.utils;

import java.util.Random;
import java.util.UUID;
import java.util.Date;

/**
 * Created by Administrator on 2019-01-13.
 */
public final class RandomIDUtil {

    /**
     * 生成唯一编码
     */
    public static String getNewUUID() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
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
            if ("char".equalsIgnoreCase(charOrNum)) {
                if (!lowerCaseChar) {
                    choice = random.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写字母还是小写字母
                }
                str.append((char) (choice + random.nextInt(26)));
            }
        }
        return str.toString();
    }

    public static String getNumId() {
        String uuid = DateTimeUtil.formatDateTime(new Date(), DateTimeUtil.DATETIME_PATTERN_LONG2) + String.valueOf(getRandom(99999999));
        return uuid;
    }
}
