public class PriorityQueue<E extends Comparable> implements Queue {
    private MaxHeap<E>  maxHeap;

    public PriorityQueue(){
        maxHeap=new MaxHeap<>();
    }
    @Override
    public int size() {
        return maxHeap.size();
    }

    @Override
    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }


    @Override
    public void enQueue(Object e) {
        maxHeap.add((E)e);
    }



    @Override
    public E deQueue() {
        return maxHeap.deleteMax();
    }

    @Override
    public E element() {
        return maxHeap.findMax();
    }
}
