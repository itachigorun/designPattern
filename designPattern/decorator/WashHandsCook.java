
/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/6 23:52
 */
public class WashHandsCook extends FilterCook {
    public WashHandsCook(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void cookDinner() {
        System.out.println("先洗手");
        cook.cookDinner();
    }
}
