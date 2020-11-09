public interface Queue<E> {
    int size();
    boolean isEmpty();
    void enQueue(E e);
    E deQueue();
    E element();
}
