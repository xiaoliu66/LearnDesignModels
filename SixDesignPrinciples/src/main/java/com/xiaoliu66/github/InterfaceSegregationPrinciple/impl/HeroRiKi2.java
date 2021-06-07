package com.xiaoliu66.github.InterfaceSegregationPrinciple.impl;

import com.xiaoliu66.github.InterfaceSegregationPrinciple.Interface.ISkillInvisible;
import com.xiaoliu66.github.InterfaceSegregationPrinciple.Interface.ISkillSilent;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 22:08
 * @version 1.0
 */
public class HeroRiKi2 implements ISkillSilent, ISkillInvisible {
    @Override
    public void doInvisible() {
        System.out.println("隐刺四技能");
    }

    @Override
    public void doSilent() {
        System.out.println("卓尔游侠的二技能");
    }
}
