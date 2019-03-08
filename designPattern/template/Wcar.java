/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 17:08
 */
public class Wcar extends CarModel {
    @Override
    protected void start() {
        System.out.println("大众车启动 。。。 ");
    }

    @Override
    protected void stop() {
        System.out.println("大众车停车");
    }
}
