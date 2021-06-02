package com.xiaoliu66.github.LiskovSubstitutionPrinciple.abstractDomain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/2 22:40
 * @version 1.0
 * 信用卡
 */
public class CreditCard extends CashCard {
    private Logger logger = LoggerFactory.getLogger(CreditCard.class);

    public CreditCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    boolean rule2(BigDecimal amount) {
        return amount.compareTo(new BigDecimal(1000)) > 0;
    }

    /**
     * 贷款
     * @param orderId
     * @param amount
     * @return
     */
    public String loan(String orderId, BigDecimal amount) {
        boolean rule = rule2(amount);
        if (!rule) {
            logger.info("生成贷款单失败，超限。单号：{} 金额：{}", orderId, amount);
        }
        logger.info("生成贷款单成功，单号：{} 金额：{}", orderId, amount);

        logger.info("贷款成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 还款
     * @param orderId
     * @param amount
     * @return
     */
    public String repayment(String orderId, BigDecimal amount) {
        logger.info("生成还款单，单号：{} 金额：{}", orderId, amount);
        logger.info("换款成功，单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }
}
