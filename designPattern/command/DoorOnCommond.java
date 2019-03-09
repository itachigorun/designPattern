/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 17:13
 */
public class DoorOnCommond implements Command {
    private Door door;

    public DoorOnCommond(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
