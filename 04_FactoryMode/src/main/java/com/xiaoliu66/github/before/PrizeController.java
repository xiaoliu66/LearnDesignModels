package com.xiaoliu66.github.before;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author xiaoliu66@github.com
 * @since 2021/6/9 21:28
 * @version 1.0
 * 抽奖类
 */
public class PrizeController {
    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes = null;
        try {
            logger.info("奖品发放开始{} req:{} ", req.getuId(), reqJson);
            // 按照不同的类型方法发放商品（1.优惠券 2.实物商品 3.第三方兑换卡）
            if (req.getAwardType() == 1) {
                logger.info("中奖的是优惠券");
            } else if (req.getAwardType() == 2) {
                logger.info("中奖的是实物商品");
            } else if (req.getAwardType() == 3) {
                logger.info("中奖的是第三方兑换卡");
            }
        } catch (Exception e) {
            logger.error("奖品发放失败{}", req.getuId());
        }
        return awardRes;
    }

    private String queryUserName(String uId) {
        return "三花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }


}
