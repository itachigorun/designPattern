/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 13:46
 */
public class Main {
    public static void main(String[] args) {
        AreaA a = new AreaA2();
        a.qiao = new AreaB3();
        a.fromAreaA();
        a.qiao.targetAreaB();
    }
}
