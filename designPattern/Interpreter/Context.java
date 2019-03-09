import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 23:56
 */
public class Context {
    private Map<Variable, Boolean> map = new HashMap<>();

    public void assign(Variable var, boolean value) {
        map.put(var, new Boolean(value));
    }

    public boolean lookup(Variable var) throws IllegalArgumentException {
        Boolean value = map.get(var);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }
}
