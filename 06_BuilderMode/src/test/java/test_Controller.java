import com.xiaoliu66.github.before.DecorationPackageController;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/16 21:44
 * @version 1.0
 */
public class test_Controller {

    @Test
    public void test() {
        DecorationPackageController decoration = new DecorationPackageController();

        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"), 1));

        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"), 2));

        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"), 3));
    }
}
