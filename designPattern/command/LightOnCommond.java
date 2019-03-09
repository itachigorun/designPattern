/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 17:13
 */
public class LightOnCommond implements Command {
    private Light light;

    public LightOnCommond(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
