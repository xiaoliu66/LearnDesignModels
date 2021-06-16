package com.xiaoliu66.github.after;

import com.xiaoliu66.github.before.Matter;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/16 22:34
 * @version 1.0
 */
public interface IMenu {
    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter); // 涂料

    IMenu appendFloor(Matter matter); // 地板

    IMenu appendTile(Matter matter); // 地砖

    String getDetails(); // 明细

}
