/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 12:54
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start() {
        System.out.println("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("Computer start end");
    }

    public void shutDown() {
        System.out.println("Computer shutDown begin");
        cpu.shutDown();
        disk.shutDown();
        memory.start();
        System.out.println("Computer shutDown end");
    }
}
