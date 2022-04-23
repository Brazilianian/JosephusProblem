public class LinkedCircleList<E> {
    MyNode<E> first;
    MyNode<E> last;
    private int count;

    public int getCount() {
        return count;
    }

    public void add(E item) {
        MyNode<E> newNode = new MyNode<>(item, first);
        if (first == null) {
            first = newNode;
            last = newNode;
            first.next = newNode;
        } else {
            first = newNode;
        }
        last.next = first;
        count++ ;
    }

    public void print() {
        MyNode<E> x = first;
        while(x != null) {
            MyNode<E> next = x.next;
            System.out.println(x.item);
            x = next;
        }
    }

    public void printOneCircle() {
        String text = "";
        MyNode<E> x = first;
        for (int i = 0; i < count; i++) {
            text += x.item + " ";
            x = x.next;
        }
        System.out.println(text);
    }

    public void removeEach(int interval) {
        int number = 1;
        MyNode<E> x = first;
        do {
            if ((number + 1) % interval == 0) {
                if (x.next == first) {
                    first = x.next.next;
                } else {
                    x.next = x.next.next;
                }
                number++;
                count--;
                printOneCircle();
            }
            number++;
            x = x.next;
        } while (getCount() != 1);
    }
}
