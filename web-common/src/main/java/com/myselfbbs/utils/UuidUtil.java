package com.myselfbbs.utils;

import java.util.UUID;

/**
 * uuid帮助类
 */
public final class UuidUtil {
    /**
     * 生成新UUID
     *
     * @return 新UUID
     */
    public static final String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "");
    }
}
