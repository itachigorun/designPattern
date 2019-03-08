/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 11:09
 */
public class Customer implements IBuyCar {
    private int cash;

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public void buyCar() {
        System.out.println("买了一辆车花费" + cash + "元");
    }
}
