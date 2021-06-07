package com.xiaoliu66.github.DependenceInversionPrinciple.service;

import com.xiaoliu66.github.DependenceInversionPrinciple.domain.BetUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 22:20
 * @version 1.0
 */
public class DrawControl {

    /**
     * 随机抽取指定数量的用户，作为中奖用户
     * @param list
     * @param count
     * @return
     */
    public List<BetUser> doDrawRandom(List<BetUser> list, int count) {
        if (list == null || list.size() <= count) return list;

        // 打乱集合
        Collections.shuffle(list);
        List<BetUser> betUserList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            betUserList.add(list.get(i));
        }

        return betUserList;
    }

    /**
     * 根据用户权重，抽取指定数量的中奖用户
     * @param list
     * @param count
     * @return
     */
    public List<BetUser> doDrawWeight(List<BetUser>list, int count) {
        if (list == null || list.size() <= count) return list;

        list.sort((u1,u2) -> {
            int i = u2.getUserWeight() - u1.getUserWeight();
            if (0 == i) return 0;
            return i > 0 ? 1 : -1;
        });
        System.out.println(list);
        List<BetUser> betUserList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            betUserList.add(list.get(i));
        }

        return betUserList;
    }
}
