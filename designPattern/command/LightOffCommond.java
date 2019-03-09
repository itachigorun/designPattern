/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 17:13
 */
public class LightOffCommond implements Command {
    private Light light;

    public LightOffCommond(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
