package com.keington.huaweicloud.sms.common;

import lombok.Data;

/**
 * @author: 许怀安
 * @date: 2022/3/23
 */
@Data
public class HwSmsResult {
    private String originTo;
    private String createTime;
    private String from;
    private String smsMsgId;
    private String status;
}
