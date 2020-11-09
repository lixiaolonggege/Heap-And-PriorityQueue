import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //MaxHeap<Integer> maxHeap=new MaxHeap<>();
        /*int[] arr={5,1,4,6,9,17,18,36,25,3,11,16,22,14,88,2,19,66,54,33};
        for(int i=0;i<arr.length;i++){
            maxHeap.add(arr[i]);
        }
        System.out.println(maxHeap.size());

       for(int i=0;i<20;i++){
            System.out.print(maxHeap.deleteMax()+"-");
        }*/

       /* int n=10000;
        Random random=new Random();
        for(int i=0;i<n;i++){
            maxHeap.add(random.nextInt(Integer.MAX_VALUE));
        }
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=maxHeap.deleteMax();
        }
        for (int i = 0; i < (n - 1); i++) {
            if(i==n-2)
                System.out.println("嘿嘿");
            if(arr[i]<arr[i+1])
                throw new IllegalArgumentException("ERROR"+i+": "+arr[i]+" "+(i+1)+": "+arr[i+1]);
        }

        System.out.println("Test MaxHeap Completed");
*/
       /*int n=10000;
       Integer[] arrs=new Integer[n];
       Random random=new Random();
        for (int i = 0; i < n; i++) {
            arrs[i]=random.nextInt(Integer.MAX_VALUE);
        }
        MaxHeap<Integer> maxHeap=new MaxHeap<Integer>(arrs);
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=maxHeap.deleteMax();
        }
        for (int i = 0; i < (n - 1); i++) {

            if(arr[i]<arr[i+1])
                throw new IllegalArgumentException("ERROR "+i+": "+arr[i]+" "+(i+1)+": "+arr[i+1]);
        }

        System.out.println("Test MaxHeap Completed");*/
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        Random random=new Random();
        for (int i = 0; i < 20; i++) {
            priorityQueue.enQueue(random.nextInt(1000));
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(priorityQueue.deQueue()+" ");
        }
    }
}
