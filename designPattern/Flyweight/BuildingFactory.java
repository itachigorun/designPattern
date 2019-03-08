import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 15:59
 */
public class BuildingFactory {
    private static final Map<String, Gymnasium> map = new HashMap<String, Gymnasium>();

    public static Gymnasium getMap(String sport) {
        Gymnasium Gymnasium = map.get(sport);
        if (Gymnasium == null) {
            Gymnasium = new Gymnasium(sport);
            map.put(sport, Gymnasium);
        }
        return Gymnasium;
    }

    public static int getSize() {
        return map.size();
    }
}
