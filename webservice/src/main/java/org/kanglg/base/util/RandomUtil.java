package org.kanglg.base.util;

import java.util.UUID;

/**
 * 随机数据生产工具
 * Created by kanglg on 2017/2/24.
 */
public final class RandomUtil {
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
