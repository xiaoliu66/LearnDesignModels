package com.xiaoliu66.github.before.ceilling;

import com.xiaoliu66.github.before.Matter;

import java.math.BigDecimal;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/16 21:19
 * @version 1.0
 */
public class LevelOneCeiling implements Matter {

    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "一级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "一级吊顶描述";
    }
}
