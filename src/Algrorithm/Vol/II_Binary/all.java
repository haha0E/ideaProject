package Algrorithm.Vol.II_Binary;

import java.util.Arrays;

public class all {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3};
//        allsort(a);
        System.out.println();
        int [] t=new int[a.length];
        for(int i=0;i<t.length;i++){
            t[i]=i;//t={0,1,2,3,....}
        }
        allsort_2(a, t,t.clone(), 1);
    }
    /**
     * 全排列的递归方法
     * @param x
     * @param t
     * @param i
     */
    public static void allsort_2(int[] x,int[] t,int[] t1,int i){
        if(i == x.length){
            i=1;
        }
        swap(t,i-1,i);
        swap(x,i-1,i);
        if(t[i-1]!=t[i]) {
            System.out.println(Arrays.toString(x));//防止与上一层输出数组一样
        }
        if(!Arrays.equals(t1,t))/*递归出口条件:交换值后与原数组相等*/{
            allsort_2(x,t,t1,++i);
        }
    }
    public static void swap(int[] x,int a,int b){
        int temp=x[a];
        x[a]=x[b];
        x[b]=temp;
    }
}
