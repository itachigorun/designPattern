/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 16:03
 */

/**
 * 饿汉式，初始时建立实例
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
    }
}