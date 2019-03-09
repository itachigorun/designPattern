/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 13:33
 */
public class Main {
    public static void main(String[] args) {
        AllyControlCenter allyControlCenter = new ConcreteAllyControlCenter("金庸群侠");
        Observer player1, player2, player3, player4;
        player1 = new Player("杨过");
        allyControlCenter.join(player1);

        player2 = new Player("令狐冲");
        allyControlCenter.join(player2);

        player3 = new Player("张无忌");
        allyControlCenter.join(player3);

        player4 = new Player("段誉");
        allyControlCenter.join(player4);

        player1.beAttacked(allyControlCenter);
    }
}
