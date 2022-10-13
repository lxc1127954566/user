package com.linxc.master_campus.user.login.common.dto;

import com.linxc.master_campus.user.login.common.model.TimeStampAndCountModel;
import lombok.Data;

import java.util.Map;
import java.util.Objects;

/**
 * @author Administrator
 */
@Data
public class ValidIpCountInTimeRequest {
    private String ip;
    private static Map<String, TimeStampAndCountModel> map;

    public ValidIpCountInTimeRequest(){
        TimeStampAndCountModel model = map.get(ip);
        if (Objects.isNull(model)) {
            Long time = System.currentTimeMillis();
            TimeStampAndCountModel model1 = new TimeStampAndCountModel(0, time);
            map.put(ip,model1);
        }
        if (validCount(model.getCount())){

        }
    }

    public boolean validCount(int count){
        if (count >= 5) {
            return false;
        }
        return true;
    }
}
