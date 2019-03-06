import java.util.ArrayList;

/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/6 22:18
 */
public class Folder extends AbstractFile {
    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("***对文件夹'" + name + "'进行杀毒");
        for (Object file : fileList) {
            ((AbstractFile) file).killVirus();
        }
    }
}
