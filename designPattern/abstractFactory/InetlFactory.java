/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/29 9:23
 */
public class InetlFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
