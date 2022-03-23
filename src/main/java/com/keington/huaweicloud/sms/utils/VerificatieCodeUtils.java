package com.keington.huaweicloud.sms.utils;

import java.util.Random;

/**
 * @author: 许怀安
 * @date: 2022/3/23
 * @description: 验证码随机生成
 */

public class VerificatieCodeUtils {
    public static String getRandNum(int charCount) {
        StringBuilder charValue = new StringBuilder();
        for (int i = 0; i < charCount; i++) {
            char c = (char) (randomInt(0, 10) + '0');
            charValue.append(String.valueOf(c));
        }
        return charValue.toString();
    }

    public static int randomInt(int from, int to) {
        Random r = new Random();
        return from + r.nextInt(to - from);
    }
}
