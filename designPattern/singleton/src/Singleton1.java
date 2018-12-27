/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 15:59
 */

/**
 * 只适合单线程模式，多线程时有可能会创建两个实例
 */
public class Singleton1 {
    private static Singleton1 instance = null;
    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
