/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/9 14:29
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.operation();
    }

    public void operation() {
        Object[] objects = {"One", "Two", "Three",
                "Four", "Five", "Six"};
        Aggregate aggregate = new ConcreteAggregate(objects);
        Iterator iterator = aggregate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
