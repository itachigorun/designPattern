/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/29 9:29
 */
public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(938);
    }
}
