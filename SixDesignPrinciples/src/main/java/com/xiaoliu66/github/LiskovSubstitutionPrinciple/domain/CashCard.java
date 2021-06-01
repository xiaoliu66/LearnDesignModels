package com.xiaoliu66.github.LiskovSubstitutionPrinciple.domain;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @version 1.0
 * @since 2021/5/27 23:01
 * 模拟储蓄卡功能
 */
public class CashCard {
    private final Logger logger = LoggerFactory.getLogger(CashCard.class);

    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000 成功、0001 失败、0002 重复
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        // 模拟支付成功
        logger.info("提现成功，单号：{} 金额：{} ", orderId, amount);
        return "0000";
    }

    /**
     * 储蓄
     * @param orderId
     * @param amount
     * @return
     */
    public String recharge(String orderId, BigDecimal amount) {
        // 模拟充值成功
        logger.info("储蓄成功，单号：{} 金额：{}", orderId, amount);
        return "0000";
    }

    /**
     * 交易流水查询
     * @return 交易流水
     */
    public List<String> tradeFlow() {
        logger.info("交易流水查询成功");
        List<String> tradeList = new ArrayList<>();
        tradeList.add("10001,100.99");
        tradeList.add("10001,80.99");
        tradeList.add("10001,76.69");
        tradeList.add("10001,126.99");
        return tradeList;
    }

}
