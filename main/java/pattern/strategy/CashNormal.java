package pattern.strategy;

/**
 * 正常
 *
 * @author lixiangxiang | 2019/8/7
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
