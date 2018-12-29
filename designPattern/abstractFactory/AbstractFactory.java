/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/29 9:21
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     */
    public Cpu createCpu();

    /**
     * 创建主板对象
     */
    public Mainboard createMainboard();
}
