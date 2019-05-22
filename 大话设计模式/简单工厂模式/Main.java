/**
 * Description:
 *
 * @author houkepan
 * @date 2019/5/22 18:54
 */
public class Main {
    public static void main(String args[]){
        Operation operation;
        operation = OperationFactory.createOperate("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
