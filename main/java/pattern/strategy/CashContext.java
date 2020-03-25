package pattern.strategy;

/**
 * 策略模式 + 简单工厂模式
 *
 * @author lixiangxiang | 2019/8/7
 */
public class CashContext {

    private CashSuper cash;

    public CashContext(String type) {
        if ("normal".equalsIgnoreCase(type)) {
            this.cash = new CashNormal();
        } else if ("return".equalsIgnoreCase(type)) {
            this.cash = new CashReturn();
        } else if ("rebate".equalsIgnoreCase(type)) {
            this.cash = new CashRebate();
        }
    }

    public double getResult(double money) {
        return cash.acceptCash(money);
    }
}
