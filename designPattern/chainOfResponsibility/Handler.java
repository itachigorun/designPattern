import java.nio.file.Files;

/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 16:11
 */
public abstract class Handler {
    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract void doHandler(Document document);
}
