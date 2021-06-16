package com.xiaoliu66.github.before;

import java.math.BigDecimal;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/15 22:40
 * @version 1.0
 */
public interface Matter {
    String scene(); // 场景：地板、地砖、涂料、吊顶

    String brand(); // 品牌

    String model(); // 型号

    BigDecimal price(); // 价格

    String desc(); // 描述
}
