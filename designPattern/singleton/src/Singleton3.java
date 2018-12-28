/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 16:12
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 多线程，加锁同步
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(day) + " 单例3--懒汉式-线程安全");
    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }

        return instance;
    }
}
