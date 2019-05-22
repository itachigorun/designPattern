/**
 * Description:
 *
 * @author houkepan
 * @date 2019/5/22 18:50
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                    System.out.println("错误的运算符");
        }
        return operation;
    }
}
