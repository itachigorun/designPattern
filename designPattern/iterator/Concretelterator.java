/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 14:24
 */
public class Concretelterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int index = 0;
    private int size = 0;

    public Concretelterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.size = aggregate.size();
        index = 0;
    }

    @Override
    public Object currentItem() {
        return aggregate.getElement(index);
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public boolean isDone() {
        return (index >= size);
    }

    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }
}
