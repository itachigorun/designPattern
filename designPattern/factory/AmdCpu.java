/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/28 22:50
 */
public class AmdCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}
