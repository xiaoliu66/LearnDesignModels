package com.xiaoliu66.github.before.coat;

import com.xiaoliu66.github.before.Matter;

import java.math.BigDecimal;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/16 21:26
 * @version 1.0
 */
public class LiBangCoat implements Matter {

    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "默认级别";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }

    @Override
    public String desc() {
        return "立邦描述";
    }
}
