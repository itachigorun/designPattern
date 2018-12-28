/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 17:01
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 推荐
 * 枚举实现单例模式
 * JVM保证枚举不能被反射并且构造器方法只执行一次
 */
public class Singleton6 {
    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton {
        INSTANCE;

        private Singleton6 singleton;

        //JVM会保证此方法绝对只调用一次
        private Singleton() {
            Date day = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(df.format(day) + " 单例6-枚举式(推荐)-线程安全");
            singleton = new Singleton6();
        }

        public Singleton6 getInstance() {
            return singleton;
        }
    }
}
