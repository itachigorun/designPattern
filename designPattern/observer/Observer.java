/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 23:06
 */
public interface Observer {
    public String getName();

    public void setName(String name);

    public void help();

    public void beAttacked(AllyControlCenter allyControlCenter);
}
