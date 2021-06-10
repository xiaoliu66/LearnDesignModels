package com.xiaoliu66.github.after.impl;

import com.xiaoliu66.github.after.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/10 21:47
 * @version 1.0
 */
public class CouponCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> exMap) throws Exception {
        logger.info("开始发放优惠券奖品");
    }
}
