/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/6 23:36
 */
public class PowerAdaptor implements Power110V {
    private Power220V power220V;

    public PowerAdaptor(Power220V power220V) {
        super();
        this.power220V = power220V;
    }

    @Override
    public void connect() {
        power220V.connect();
    }
}
