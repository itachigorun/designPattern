/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 17:05
 */
public abstract class CarModel {
    protected abstract void start();

    protected abstract void stop();

    final public void excet() {
        this.start();
        this.stop();
    }
}
