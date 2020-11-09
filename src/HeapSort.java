import java.util.Arrays;
import java.util.Random;

public class HeapSort {
    //将最初无序数组调整为堆 (大根堆)
    public static void makeHeap(int[] arr,int end) {
        if(arr==null||arr.length==0||end<1)
            return;
        int parent=(end-1)/2;
        for (int i = parent; i >= 0; i--) {
            down(arr,i,end);
        }
    }

    //数组下标为i元素向下移动，构建成堆
    public static void down(int[] arr,int i,int end){
        while(2*i+1<=end){
            int j=2*i+1;
            if(j+1<end&&arr[j+1]>arr[j]) j++;
            if(arr[i]>arr[j])
                break;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i=j;
        }
    }

    //堆排序
    public static void heapSort(int[] arr){
        makeHeap(arr,arr.length-1);
        for (int i=arr.length-1;i>0;i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            down(arr,0, i - 1);
        }
    }

    public static void main(String[] args) {
        int n=20;
        int[] arr=new int[n];
        Random random=new Random();
        for (int i = 0; i < n; i++) {
            arr[i]=random.nextInt(1000);
        }

        heapSort(arr);
        Arrays.toString(arr);



        /*for (int i = 0; i < (arr.length - 1); i++) {
            if(arr[i]>arr[i+1])
                System.out.println(false+" "+i+": "+arr[i]+" "+(i+1)+": "+arr[i+1]);
        }*/
        System.out.println(Arrays.toString(arr));
    }
}
