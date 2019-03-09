/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 16:27
 */
public class ManagerTwo extends Handler {
    private final String name = "总经理";
    private final int level = 3;

    @Override
    public void doHandler(Document document) {
        if (this.level < document.getLevel()) {
            System.out.println(name + "未处理文件《" + document.getFileName() + "》");
            getNextHandler().doHandler(document);
        } else {
            System.out.println(name + "处理了文件《" + document.getFileName() + "》");
        }
    }
}
