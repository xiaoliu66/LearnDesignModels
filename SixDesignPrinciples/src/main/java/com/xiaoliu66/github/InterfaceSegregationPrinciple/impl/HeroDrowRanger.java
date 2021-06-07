package com.xiaoliu66.github.InterfaceSegregationPrinciple.impl;

import com.xiaoliu66.github.InterfaceSegregationPrinciple.Interface.ISkill;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 21:54
 * @version 1.0
 * dota2 卓尔游侠
 */
public class HeroDrowRanger implements ISkill {
    @Override
    public void doArchery() {
        System.out.println("卓尔游侠的一技能");
    }

    @Override
    public void doInvisible() {
        // 无隐身需要隐刀
    }

    @Override
    public void doSilent() {
        System.out.println("卓尔游侠的二技能");
    }

    @Override
    public void doVertigot() {
        //  无眩晕
    }
}
