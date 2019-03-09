
/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 23:07
 */
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void help() {
        System.out.println("坚持住," + this.name + "来救你!");
    }

    @Override
    public void beAttacked(AllyControlCenter allyControlCenter) {
        System.out.println(this.name + "被攻击!");
        allyControlCenter.notifyObserver(name);
    }
}
