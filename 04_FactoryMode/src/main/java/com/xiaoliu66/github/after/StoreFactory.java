package com.xiaoliu66.github.after;

import com.xiaoliu66.github.after.impl.CardCommodityService;
import com.xiaoliu66.github.after.impl.CouponCommodityService;
import com.xiaoliu66.github.after.impl.GoodsCommodityService;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/10 21:56
 * @version 1.0
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (commodityType == null) return null;
        if (commodityType == 1) {
            return new CouponCommodityService();
        } else if (commodityType == 2) {
            return new GoodsCommodityService();
        } else if (commodityType == 3) {
            return new CardCommodityService();
        } else {
            throw new RuntimeException("不存在的奖品类型。");
        }
    }
}
