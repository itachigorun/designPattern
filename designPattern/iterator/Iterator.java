/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 14:23
 */
public interface Iterator {
    public void first();

    public void next();

    public boolean isDone();

    public Object currentItem();
}
