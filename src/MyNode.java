public class MyNode<E> {
    E item;
    MyNode<E> next;

    public MyNode(E item, MyNode<E> next) {
        this.item = item;
        this.next = next;
    }
}
