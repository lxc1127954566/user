package com.linxc.master_campus.user.login.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author linxc
 */
@Data
@AllArgsConstructor
public class TimeStampAndCountModel {

    private int count;
    private Long timestamp;
}
