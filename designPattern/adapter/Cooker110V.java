/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/6 23:34
 */
public class Cooker110V {
    private Power110V power110V;

    public Cooker110V(Power110V power110V) {
        super();
        this.power110V = power110V;
    }

    public void cook() {
        power110V.connect();
        System.out.println("开始工作");
    }
}
