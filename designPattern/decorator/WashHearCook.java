/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/6 23:53
 */
public class WashHearCook extends FilterCook {
    public WashHearCook(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void cookDinner() {
        System.out.println("先洗头");
        cook.cookDinner();
    }
}
