package pattern.strategy;

/**
 * 满减
 *
 * @author lixiangxiang | 2019/8/7
 */
public class CashReturn implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money >= 300 ? money - 100 : money;
    }
}
