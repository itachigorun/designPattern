/**
 * Description:
 *
 * @author houkepan
 * @date 2019/5/22 19:27
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type){
        CashSuper cashSuper = null;
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
                System.out.println("错误收费方式");
                break;
        }

        return cashSuper;
    }
}
