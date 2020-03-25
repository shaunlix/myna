package pattern;

import org.junit.Assert;
import org.junit.Test;
import pattern.strategy.CashContext;

/**
 * @author lixiangxiang | 2019/8/7
 */
public class StrategyTest {

    @Test
    public void testCash() {
        CashContext context = new CashContext("return");
        Assert.assertEquals(700, context.getResult(800),0);
    }
}
