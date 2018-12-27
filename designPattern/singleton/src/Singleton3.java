/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 16:12
 */

/**
 * 多线程，加锁同步
 */
public class Singleton3 {
    private static Singleton3 instance = null;
    private Singleton3(){}

    public static synchronized Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }

        return instance;
    }
}
