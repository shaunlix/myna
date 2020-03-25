package pattern.strategy;

/**
 * 打折
 * @author lixiangxiang | 2019/8/7
 */
public class CashRebate implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money * 0.8;
    }

}
