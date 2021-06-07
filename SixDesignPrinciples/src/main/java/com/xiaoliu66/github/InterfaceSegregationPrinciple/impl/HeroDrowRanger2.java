package com.xiaoliu66.github.InterfaceSegregationPrinciple.impl;

import com.xiaoliu66.github.InterfaceSegregationPrinciple.Interface.ISkillArchery;
import com.xiaoliu66.github.InterfaceSegregationPrinciple.Interface.ISkillSilent;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 22:07
 * @version 1.0
 */
public class HeroDrowRanger2 implements ISkillArchery, ISkillSilent {
    @Override
    public void doArchery() {
        System.out.println("卓尔游侠的一技能");
    }

    @Override
    public void doSilent() {
        System.out.println("卓尔游侠的二技能");
    }
}
