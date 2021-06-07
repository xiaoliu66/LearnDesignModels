package com.xiaoliu66.github.DependenceInversionPrinciple.service.impl;

import com.xiaoliu66.github.DependenceInversionPrinciple.domain.BetUser;
import com.xiaoliu66.github.DependenceInversionPrinciple.service.IDraw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 22:57
 * @version 1.0
 */
public class DrawRandom implements IDraw {
    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        if (list == null || list.size() <= count) return list;

        // 打乱集合
        Collections.shuffle(list);
        List<BetUser> betUserList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            betUserList.add(list.get(i));
        }

        return betUserList;
    }
}
