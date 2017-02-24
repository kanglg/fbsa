package org.kanglg.base.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * 加密工具
 * Created by kanglg on 2017/2/24.
 */
public final class EndecryptUtils {
    public static String MD5Password(String password, String salt) {
        return new Md5Hash(password, salt, 2).toBase64();
    }
}
