/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/6 22:09
 */
abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
