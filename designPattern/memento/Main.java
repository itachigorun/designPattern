/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 17:35
 */
public class Main {
    public static void main(String[] args) {
        //创建人物 G
        GamePlayer player = new GamePlayer("小明", 100, 100, 1);
        //控制备份数据的对象
        CaretakePlayer caretakePlayer = new CaretakePlayer();
        //进行备份
        caretakePlayer.setBackup(player.saveBackup());
        //打怪
        player.killBoss();
        //恢复备份
        player.resumePlayer(caretakePlayer.getBackup());
        System.out.println("====================================");
        System.out.println("满血复活。。。");
        System.out.println("====================================");
        //继续打怪
        player.killBoss();
    }
}
