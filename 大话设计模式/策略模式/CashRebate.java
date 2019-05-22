/**
 * Description:
 *
 * @author houkepan
 * @date 2019/5/22 19:19
 */
public class CashRebate extends CashSuper{
    private double moneyRebate;
    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

    public CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate / 10;
    }
}
