/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 16:19
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 懒汉式,双重校验，线程安全,延迟加载
 */
public class Singleton4 {
    private static Singleton4 instance = null;

    private Singleton4() {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(day) + " 单例4-懒汉式-线程安全");
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }

        return instance;
    }
}
