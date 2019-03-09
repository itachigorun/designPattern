/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 17:13
 */
public class DoorOffCommond implements Command {
    private Door door;

    public DoorOffCommond(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
