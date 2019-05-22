/**
 * Description:
 *
 * @author houkepan
 * @date 2019/5/22 19:17
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type){
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate(8);
                break;
            default:
                System.out.println("错误的收费方式");
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
