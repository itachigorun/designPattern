import java.util.Iterator;

/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 14:21
 */
public class ConcreteAggregate extends Aggregate {
    private Object[] objArray = null;

    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {
        return new Concretelterator(this);
    }

    public Object getElement(int index) {
        if (index < objArray.length) {
            return objArray[index];
        } else {
            return null;
        }
    }

    public int size() {
        return objArray.length;
    }
}
