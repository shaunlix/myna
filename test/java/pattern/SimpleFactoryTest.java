package pattern;

import org.junit.Assert;
import org.junit.Test;
import pattern.simplefactory.Operation;
import pattern.simplefactory.OperationFactory;

/**
 * @author lixiangxiang | 2019/8/7
 */
public class SimpleFactoryTest {

    @Test
    public void testCarFactory() {
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.getOperation("-");
        operation.setNumA(1);
        operation.setNumA(2);
        Assert.assertEquals(2, operation.getResult(), 0);
    }
}
