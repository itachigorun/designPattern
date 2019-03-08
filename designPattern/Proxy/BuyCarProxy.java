/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 12:14
 */
public class BuyCarProxy implements IBuyCar {
    private Customer customer;

    public BuyCarProxy(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void buyCar() {
        customer.buyCar();
    }
}
