/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/28 23:03
 */
public class Main {
    public static void main(String[] args) {
        //创建装机工程师对象
        ComputerEngineer cf = new ComputerEngineer();
        //客户选择并创建需要使用的产品对象
        AbstractFactory af = new InetlFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);
    }
}
