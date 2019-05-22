/**
 * Description:
 *
 * @author houkepan
 * @date 2019/5/22 19:32
 */
public class Main {
    public static void main(String args[]){
        CashSuper cashSuper = CashFactory.createCashAccept("满300返100");
        double totalPrice = 0;
        totalPrice = cashSuper.acceptCash(1000);
        System.out.println("1000元收费" + totalPrice);


        CashContext cashContext = new CashContext("满300返100");
        double totalPriceB = 0;
        totalPriceB = cashContext.getResult(1000);
        System.out.println("1000元收费" + totalPriceB);

        /**
         * 简单工厂模式需要让客户端认识两个类，CashSuper和CashFactory，而策略模式与简单工厂结合的方法，
         * 客户端就只需要认识一个类CashContext就可以了。耦合度更加降低。
         * 运用反射，可以进一步降低耦合度，待续
         */
    }
}
