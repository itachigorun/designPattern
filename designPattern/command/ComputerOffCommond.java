/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 17:15
 */
public class ComputerOffCommond implements Command {
    private Computer computer;

    public ComputerOffCommond(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}
