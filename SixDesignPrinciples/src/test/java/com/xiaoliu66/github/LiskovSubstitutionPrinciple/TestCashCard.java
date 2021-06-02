package com.xiaoliu66.github.LiskovSubstitutionPrinciple;

import com.xiaoliu66.github.LiskovSubstitutionPrinciple.abstractDomain.CashCard;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/2 22:52
 * @version 1.0
 */
public class TestCashCard {

    @Test
    public void test() {
        CashCard bankCard = new CashCard("1234","2021-06-02");
        // 提现
        bankCard.withdrawal("1001",new BigDecimal(100));
        // 储蓄
        bankCard.recharge("1001",new BigDecimal(100));
    }
}
