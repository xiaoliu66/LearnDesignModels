package com.xiaoliu66.github.after;

import java.util.Map;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/10 21:45
 * @version 1.0
 * 发送奖品接口
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String,String> exMap) throws Exception;
}
