/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/27 15:29
 */
public class Main implements Runnable {

    private int tickets = 5;

    public static void main(String[] args) {
        Main main = new Main();
        Thread thread1 = new Thread(main);
        Thread thread2 = new Thread(main);
        Thread thread3 = new Thread(main);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "--ID:" + tickets--);
                Singleton1 singleton1 = Singleton1.getInstance();
                Singleton2 singleton2 = Singleton2.getInstance();
                Singleton3 singleton3 = Singleton3.getInstance();
                Singleton4 singleton4 = Singleton4.getInstance();
                Singleton5 singleton5 = Singleton5.getInstance();
                Singleton6 singleton6 = Singleton6.getInstance();
            }
        }
    }
}
