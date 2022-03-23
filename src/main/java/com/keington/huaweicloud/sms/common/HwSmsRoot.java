package com.keington.huaweicloud.sms.common;

import lombok.Data;

import java.util.List;

/**
 * @author: 许怀安
 * @date: 2022/3/23
 */

@Data
public class HwSmsRoot {
    private List<HwSmsResult> result;
    private String code;
    private String description;
}
