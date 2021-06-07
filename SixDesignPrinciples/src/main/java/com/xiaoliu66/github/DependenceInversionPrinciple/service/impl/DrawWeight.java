package com.xiaoliu66.github.DependenceInversionPrinciple.service.impl;

import com.xiaoliu66.github.DependenceInversionPrinciple.domain.BetUser;
import com.xiaoliu66.github.DependenceInversionPrinciple.service.IDraw;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 22:58
 * @version 1.0
 */
public class DrawWeight implements IDraw {
    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        if (list == null || list.size() <= count) return list;

        list.sort((u1,u2) -> {
            int i = u2.getUserWeight() - u1.getUserWeight();
            if (0 == i) return 0;
            return i > 0 ? 1 : -1;
        });

        List<BetUser> betUserList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            betUserList.add(list.get(i));
        }

        return betUserList;
    }
}
