package com.xiaoliu66.github.LiskovSubstitutionPrinciple.abstractDomain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/1 23:16
 * @version 1.0
 */
public abstract class BankCard {
    private final Logger logger = LoggerFactory.getLogger(BankCard.class);
    private String cardNo; // 卡号
    private String cardDate; // 开卡时间

    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    abstract boolean rule(BigDecimal amount);

    // 正向入账，加钱
    public String positive(String orderId, BigDecimal amount) {
        // 入款成功，存款、还账
        logger.info("卡号：{} 入款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    // 逆向入账，减钱
    public String negative(String orderId, BigDecimal amount) {
        // 入款成功，存款、还款
        logger.info("卡号：{} 出款成功，单号：{} 金额：{}", cardNo, orderId, amount);
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }
}
