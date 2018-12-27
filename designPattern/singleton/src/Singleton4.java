/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 16:19
 */

/**
 * 多线程，加锁同步，性能更好
 */
public class Singleton4 {
    private static Singleton4 instance = null;
    private Singleton4(){}

    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class){
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }

        return instance;
    }
}
