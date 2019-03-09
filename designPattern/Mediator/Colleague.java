/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 23:49
 */
public class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
