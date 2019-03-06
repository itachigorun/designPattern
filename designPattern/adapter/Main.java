/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/6 23:37
 */
public class Main {
    public static void main(String[] args) {
        Power220V power220V = new Power220VImpl();
        PowerAdaptor adaptor = new PowerAdaptor(power220V);
        Cooker110V cooker = new Cooker110V(adaptor);
        cooker.cook();
    }
}
