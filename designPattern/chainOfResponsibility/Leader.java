/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 16:29
 */
public class Leader extends Handler {
    private final String name = "部门领导";
    private final int level = 1;

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
