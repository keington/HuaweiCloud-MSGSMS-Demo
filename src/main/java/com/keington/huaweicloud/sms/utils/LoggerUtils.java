package com.keington.huaweicloud.sms.utils;

import org.slf4j.Logger;
/**
 * @author: 许怀安
 * @date: 2022/3/23
 */

public class LoggerUtils {
    public static void debug(Logger logger, Object message) {
        if (logger.isDebugEnabled()) {
            logger.debug("Debug日志信息{}", message);
        }
    }

    public static void info(Logger logger, Object message) {
        if (logger.isInfoEnabled()) {
            logger.info("Info日志信息{}", message);
        }
    }

    public static void error(Logger logger, Object message) {
        if (logger.isErrorEnabled()) {
            logger.error("Error日志信息{}", message);
        }
    }
}
