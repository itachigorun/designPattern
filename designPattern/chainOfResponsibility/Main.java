import javax.print.Doc;

/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 16:31
 */
public class Main {
    public static void main(String[] args) {
        //定义职责链
        Handler leader = new Leader();
        Handler managerOne = new ManagerOne();
        Handler managerTwo = new ManagerTwo();

        leader.setNextHandler(managerOne);
        managerOne.setNextHandler(managerTwo);

        Document document1 = new Document();
        document1.setFileName("部门经费审批");
        document1.setLevel(2);
        Document document2 = new Document();
        document2.setFileName("公司经费审批");
        document2.setLevel(3);

        leader.doHandler(document1);
        leader.doHandler(document2);
    }
}
