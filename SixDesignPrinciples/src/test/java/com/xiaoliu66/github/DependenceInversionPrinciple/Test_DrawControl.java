package com.xiaoliu66.github.DependenceInversionPrinciple;

import com.xiaoliu66.github.DependenceInversionPrinciple.domain.BetUser;
import com.xiaoliu66.github.DependenceInversionPrinciple.service.DrawControl;
import com.xiaoliu66.github.DependenceInversionPrinciple.service.DrawControl2;
import com.xiaoliu66.github.DependenceInversionPrinciple.service.impl.DrawRandom;
import com.xiaoliu66.github.DependenceInversionPrinciple.service.impl.DrawWeight;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 22:38
 * @version 1.0
 */
public class Test_DrawControl {
    private static final Logger logger = LoggerFactory.getLogger(Test_DrawControl.class);

    @Test
    public void test() {
        List<BetUser> betUserList = new ArrayList<>();
        betUserList.add(new BetUser("花花",21));
        betUserList.add(new BetUser("豆豆",23));
        betUserList.add(new BetUser("小黑",124));
        betUserList.add(new BetUser("小白",34));
        betUserList.add(new BetUser("笨笨",45));
        betUserList.add(new BetUser("孙卫国",43));

        DrawControl drawControl = new DrawControl();
        List<BetUser> drawRandom = drawControl.doDrawRandom(betUserList, 3);
        logger.info("随机中奖名单：{}",drawRandom);

        List<BetUser> drawWeight = drawControl.doDrawWeight(betUserList, 3);
        logger.info("权重中奖名单：{}",drawWeight);
    }

    @Test
    public void test2() {
        List<BetUser> betUserList = new ArrayList<>();
        betUserList.add(new BetUser("花花",21));
        betUserList.add(new BetUser("豆豆",23));
        betUserList.add(new BetUser("小黑",124));
        betUserList.add(new BetUser("小白",34));
        betUserList.add(new BetUser("笨笨",45));
        betUserList.add(new BetUser("孙卫国",43));

        DrawControl2 drawControl = new DrawControl2();
        List<BetUser> betUserList1 = drawControl.doDraw(new DrawRandom(), betUserList, 3);
        logger.info("随机中奖名单：{}",betUserList1);

        List<BetUser> betUserList2 = drawControl.doDraw(new DrawWeight(), betUserList, 3);
        logger.info("随机中奖名单：{}",betUserList2);

    }
}
