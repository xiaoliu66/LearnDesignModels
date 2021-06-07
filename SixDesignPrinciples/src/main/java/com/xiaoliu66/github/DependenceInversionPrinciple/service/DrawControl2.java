package com.xiaoliu66.github.DependenceInversionPrinciple.service;

import com.xiaoliu66.github.DependenceInversionPrinciple.domain.BetUser;

import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 22:59
 * @version 1.0
 */
public class DrawControl2 {
    private IDraw idraw;
    public List<BetUser> doDraw(IDraw idraw,List<BetUser> betUserList,int count) {
        return idraw.prize(betUserList,count);
    }
}
