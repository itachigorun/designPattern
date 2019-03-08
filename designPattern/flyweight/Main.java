/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 16:02
 */
public class Main {
    public static void main(String[] args) {
        String sport = "足球";
        for (int i = 1; i <= 5; i++) {
            Gymnasium gymnasium = BuildingFactory.getMap(sport);
            gymnasium.setName("中国体育馆");
            gymnasium.setShape("圆形");
            gymnasium.use();
            System.out.println("对象池中对象数量为:" + BuildingFactory.getSize());
        }
    }
}
