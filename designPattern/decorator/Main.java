/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/6 23:54
 */
public class Main {
    public static void main(String[] args) {
        Cook cook1 = new WashHandsCook(new ChineseCook());
        Cook cook2 = new WashHearCook(new ChineseCook());

        cook1.cookDinner();
        cook2.cookDinner();
    }
}
