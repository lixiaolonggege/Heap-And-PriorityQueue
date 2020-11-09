import java.util.ArrayList;
import java.util.Arrays;

/**
 * MaxHeap 大根堆 基于动态数组来实现（大根堆是一棵完全二叉树）
 * @param <E>
 */
public class MaxHeap<E extends Comparable> {
    private ArrayList<E> array;
    public MaxHeap(int capacity){
        array=new ArrayList<E>(capacity);
    }
    public MaxHeap(){
        array=new ArrayList<E>();
    }

    public int size(){
        return array.size();
    }

    public boolean isEmpty(){
        return array.isEmpty();
    }

    //找出index的父节点的索引
    public int parentIndex(int index){
        if(index==0) throw new IllegalArgumentException("index: 0 doesn't has parent");
        return (index-1)/2;
    }

    //找出index的左子节点的索引
    public int leftChildIndex(int index){return index*2+1;}

    //找出index的右子节点的索引
    public int rightChildIndex(int index){return index*2+2;}

    //向堆中添加元素
    public void add(E e){
        array.add(e);
        //元素上浮 调整为大根堆
        up(array.size()-1);
    }

    private void swap(int index1,int index2){
        if(index1<0||index1>size()-1||index2<0||index2>size()-1)
            throw new IllegalArgumentException("Index is illegal");
        E e=array.get(index1);
        array.set(index1,array.get(index2));
        array.set(index2,e);
    }

    //元素上浮 调整为大根堆 用于插入操作
    private void up(int index){
        while(index>0&&array.get(index).compareTo(array.get(parentIndex(index)))>0){
            swap(index,parentIndex(index));
            index=parentIndex(index);
        }
    }

    //元素下沉，调整为大根堆 用于删除操作
    public void down(int index){
        while(leftChildIndex(index)<=(size()-1)){
            int i=leftChildIndex(index);
            if(rightChildIndex(index)<=size()-1&&array.get(rightChildIndex(index)).compareTo(array.get(i))>0)
                i++;
            if(array.get(index).compareTo(array.get(i))>=0)
                break;
            swap(i,index);
            index=i;
        }
    }

    //查看堆最大元素
    public E findMax(){
        if(size()==0)
            throw new IllegalArgumentException("Heap is empty");
        E e=array.get(0);
        return e;
    }

    //删除堆最大元素
    public E deleteMax(){
        E e=findMax();
        swap(size()-1,0);
        array.remove(size()-1);
        down(0);
        return e;
    }

    //将堆顶元素替换为指定元素e
    public E replace(E e){
        E max=findMax();
        array.set(0,e);
        down(0);
        return max;
    }

    //
    public MaxHeap(E[] arr){
        array=new ArrayList<>(Arrays.asList(arr));
        for (int i = parentIndex(arr.length - 1); i >= 0; i--) {
            down(i);
        }
    }

    public E get(int index){
        return array.get(index);
    }
}
