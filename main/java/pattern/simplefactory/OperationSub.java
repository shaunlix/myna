package pattern.simplefactory;

/**
 * 操作 -
 * @author lixiangxiang | 2019/8/7
 */
public class OperationSub extends Operation {

    public double getResult() {
        return this.getNumA() - this.getNumB();
    }
}
