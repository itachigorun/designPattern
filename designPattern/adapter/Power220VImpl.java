/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/6 23:33
 */
public class Power220VImpl implements Power220V {
    @Override
    public void connect() {
        System.out.println("220V电源接通");
    }
}
