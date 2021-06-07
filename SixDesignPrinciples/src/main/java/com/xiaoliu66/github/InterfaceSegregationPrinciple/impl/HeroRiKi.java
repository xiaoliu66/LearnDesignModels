package com.xiaoliu66.github.InterfaceSegregationPrinciple.impl;

import com.xiaoliu66.github.InterfaceSegregationPrinciple.Interface.ISkill;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 22:01
 * @version 1.0
 * dota2 隐刺
 */
public class HeroRiKi implements ISkill {
    @Override
    public void doArchery() {
        // 无此技能
    }

    @Override
    public void doInvisible() {
        System.out.println("隐刺四技能");
    }

    @Override
    public void doSilent() {
        System.out.println("隐刺一技能");
    }

    @Override
    public void doVertigot() {
        // 无眩晕，可出道具大晕锤
    }
}
