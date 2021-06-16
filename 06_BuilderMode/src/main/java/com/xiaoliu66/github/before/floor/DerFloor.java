package com.xiaoliu66.github.before.floor;

import com.xiaoliu66.github.before.Matter;

import java.math.BigDecimal;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/16 21:30
 * @version 1.0
 */
public class DerFloor implements Matter {

    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "德尔地板描述";
    }
}
