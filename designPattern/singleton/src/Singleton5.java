/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 16:40
 */

/**
 * 静态内部类
 */
public class Singleton5 {
    private Singleton5(){
    }

    private static class SingletonHolder{
        private final static Singleton5 instance = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }
}
