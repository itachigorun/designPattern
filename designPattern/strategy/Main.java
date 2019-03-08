/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 16:47
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new MD5Strategy());
        context.encrypt();
    }
}
