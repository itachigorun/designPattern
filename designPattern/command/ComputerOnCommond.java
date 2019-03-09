/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 17:14
 */
public class ComputerOnCommond implements Command {
    private Computer computer;

    public ComputerOnCommond(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }

}
