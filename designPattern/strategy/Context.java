/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 16:47
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt() {
        this.strategy.encrypt();
    }
}
