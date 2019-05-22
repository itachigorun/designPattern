/**
 * Description:
 *
 * @author houkepan
 * @date 2019/5/22 18:45
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult(){
        if(getNumberB() == 0){
            System.out.println("除数不能为0");
        }

        return getNumberA() / getNumberB();
    }
}
