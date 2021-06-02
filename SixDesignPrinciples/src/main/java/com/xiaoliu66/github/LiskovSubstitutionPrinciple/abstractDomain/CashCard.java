package com.xiaoliu66.github.LiskovSubstitutionPrinciple.abstractDomain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/2 22:26
 * @version 1.0
 * 储蓄卡
 */
public class CashCard extends BankCard {
    private Logger logger = LoggerFactory.getLogger(CashCard.class);

    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    /**
     * 规则过滤，储蓄卡默认直接通过。
     * @param amount
     * @return
     */
    @Override
    boolean rule(BigDecimal amount) {
        return true;
    }

    /**
     * 提现
     * @param orderId
     * @param amount
     * @return
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        // 模拟支付成功
        logger.info("提现成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 储蓄
     * @param orderId
     * @param amount
     * @return
     */
    public String recharge(String orderId, BigDecimal amount) {
        logger.info("储蓄成功，单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }

    /**
     * 风控校验
     * @param cardNo
     * @param orderId
     * @param amount
     * @return
     */
    public boolean checkRisk(String cardNo, String orderId, BigDecimal amount) {
        logger.info("风控校验，卡号：{} 单号：{} 金额：{}", cardNo, orderId, amount);
        return true;
    }

}
