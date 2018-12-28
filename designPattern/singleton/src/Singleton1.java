/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 15:59
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 懒汉式，不推荐
 * 只适合单线程模式，多线程时有可能会创建两个实例
 */
public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1() {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(day) + " 单例1--懒汉式--线程不安全");
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
