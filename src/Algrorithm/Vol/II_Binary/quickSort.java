package Algrorithm.Vol.II_Binary;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] a={13,8,4,10,3,9,7,1,5,12,6,2,0,11};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void quickSort(int[] a,int begin,int end){
        if(begin < end){
            int p=Partition(a,begin,end);
            quickSort(a,begin,p-1);
            quickSort(a,p,end);
        }
    }
    public static int Partition(int[] a,int begin,int end){
        int base=a[begin];
        int beginIndex=begin;
        begin++;
        while(begin<end){
            if(a[end]<base&&a[begin]>base){
                swap(a,begin,end);
            }
            if(a[begin]<base){
                begin++;
            }
            if(a[end]>base){
                end--;
            }

        }
        if(a[beginIndex]>a[end]) {
            swap(a, beginIndex, end);
        }
//        System.out.println(Arrays.toString(a));
        return end;
    }
    //交换元素的值
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}