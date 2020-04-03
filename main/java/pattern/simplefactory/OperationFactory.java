package pattern.simplefactory;

/**
 * 简单工厂模式
 *
 * @author lixiangxiang | 2019/8/7
 */
public class OperationFactory {

    public Operation getOperation(String operate) {
        if ("+".equalsIgnoreCase(operate)) {
            return new OperationAdd();
        } else if ("-".equalsIgnoreCase(operate)) {
            return new OperationSub();
        } else {
            System.out.println("未兼容的算法");
            return null;
        }
    }
}
