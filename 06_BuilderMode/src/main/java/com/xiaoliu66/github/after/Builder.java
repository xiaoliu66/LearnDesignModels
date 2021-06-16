package com.xiaoliu66.github.after;

import com.xiaoliu66.github.before.ceilling.LevelOneCeiling;
import com.xiaoliu66.github.before.ceilling.LevelTwoCeiling;
import com.xiaoliu66.github.before.coat.DuluxCoat;
import com.xiaoliu66.github.before.coat.LiBangCoat;
import com.xiaoliu66.github.before.floor.ShengXiangFloor;
import com.xiaoliu66.github.before.tile.DongPengTile;
import com.xiaoliu66.github.before.tile.MarcoPoloTile;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/16 22:32
 * @version 1.0
 */
public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }
}
