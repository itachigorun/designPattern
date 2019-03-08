import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 12:25
 */
public class DynamicProxy implements InvocationHandler {
    Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object, args);

        return result;
    }
}
