package Algrorithm.Vol.I_Basic;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] x= {25,30,11,7,22,16,18,33,40,55};
        int[] arr=x.clone();
        System.out.println("排序前："+ Arrays.toString(arr));
        heapsort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
        System.out.println();
        int[] brr=x.clone();
        System.out.println("排序前："+ Arrays.toString(brr));
        BubbleSort(brr);
        System.out.println("排序后："+Arrays.toString(brr));
        System.out.println();
        int[] crr=x.clone();
        System.out.println("排序前："+ Arrays.toString(crr));
        SelectSort(crr);
        System.out.println("排序后："+Arrays.toString(crr));
        System.out.println();
        int[] drr=x.clone();
        System.out.println("排序前："+ Arrays.toString(drr));
        InsertSort(drr);
        System.out.println("排序后："+Arrays.toString(drr));

    }

    public static void heapsort(int []arr){
        //构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr,i,arr.length);
        }
        int count=1;
        //交换堆顶元素与末尾元素后调整堆结构
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);//重新对堆进行调整
            System.out.println("第"+(count++)+"次堆排序的结果为："+Arrays.toString(arr));
        }
    }

    //调整大顶堆
    public static void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];//先取出当前元素i
        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
            if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if(arr[k] >temp){//如果子节点大于父节点，将子节点值赋给父节点
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }

    //冒泡排序
    public static void BubbleSort(int[] x) {
        int n=x.length;
        for(int i=0;i<n;i++) {
            for(int j=1;j<n-i;j++) {
                if(x[j-1]>x[j]) {
                    swap(x,j-1,j);
                }
            }
            System.out.println("第"+(i+1)+"次冒泡排序的结果为："+Arrays.toString(x));
        }
    }
    //直接选择排序
    public static void SelectSort(int[] x) {
        int n=x.length;
        for(int i=0;i<n;i++) {
            int min=i;
            for(int j=i+1;j<n;j++) {
                if(x[min]>x[j]) {
                    min=j;
                }
            }
            if(min!=i) {
                swap(x,i,min);
            }
            System.out.println("第"+(i+1)+"次选择排序的结果为："+Arrays.toString(x));
        }
    }
    //直接插入排序
    public static void InsertSort(int[] x) {
        int n=x.length;
        for(int i=1;i<n;i++) {
            for(int j=i-1;j>=0;j--) {
                if(x[j+1]<x[j]){
                    swap(x,j,j+1);
                }
            }
            System.out.println("第"+i+"次插入排序的结果为："+Arrays.toString(x));
        }
    }
    //交换元素的值
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}