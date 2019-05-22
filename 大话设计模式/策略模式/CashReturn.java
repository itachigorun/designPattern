/**
 * Description:
 *
 * @author houkepan
 * @date 2019/5/22 19:23
 */
public class CashReturn extends CashSuper {
    private double moneyConditon;
    private double moneyReturn;
    public CashReturn(double moneyConditon, double moneyReturn){
        this.moneyConditon = moneyConditon;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money > moneyConditon){
            result = money - Math.floor(money / moneyConditon) * moneyReturn;
        }

        return result;
    }
}
