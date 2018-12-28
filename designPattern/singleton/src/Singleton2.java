/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 16:03
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 饿汉式，推荐
 * 优点：初始时建立实例,多实例时只实例化一次,能够避免多线程同步问题
 * 缺点：类加载的时候就实例化，不能用到的时候实例化，会浪费一定内存
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(day) + " 单例2--饿汉式-线程安全");
    }

    public static Singleton2 getInstance() {
        return instance;
    }

}