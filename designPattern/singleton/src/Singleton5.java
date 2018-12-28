/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 16:40
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 推荐
 * 静态内部类，线程安全，延迟加载
 * 类的静态属性只会在第一次加载类的时候初始化
 */
public class Singleton5 {
    private Singleton5() {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(day) + " 单例5-静态内部类(推荐)-线程安全");
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private final static Singleton5 instance = new Singleton5();
    }
}
