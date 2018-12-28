/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/28 22:48
 */
public class IntelCpu implements Cpu {
    /**
     * CPU针脚数
     */
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
