/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 17:09
 */
public class Ocar extends CarModel {
    @Override
    protected void start() {
        System.out.println("奥迪车启动");
    }

    @Override
    protected void stop() {
        System.out.println("奥迪停车");
    }
}
