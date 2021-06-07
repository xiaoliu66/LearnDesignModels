package com.xiaoliu66.github.DependenceInversionPrinciple.service;

import com.xiaoliu66.github.DependenceInversionPrinciple.domain.BetUser;

import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 22:54
 * @version 1.0
 */
public interface IDraw {
    // 获取用户中奖接口
    List<BetUser> prize(List<BetUser> list,int count);
}
