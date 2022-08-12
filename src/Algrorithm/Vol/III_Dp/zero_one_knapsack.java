package Algrorithm.Vol.III_Dp;

/**
 * 0-1背包问题
 */
public class zero_one_knapsack {
    public static void main(String[] args) {
        /**
         * 题目参数（两个数组前面加个0，纯属因为懒，下面的都是1开头的，不想逐个改）。
         */
        int[] v={0,20,6,8,15,18};//价值
        int[] w={0,5,4,8,6,9};//重量
        int volume=18;//容量
        int[][] bag=new int[v.length][volume+1];//0-1背包问题实现容器
        int[] x=new int[v.length];//记录各个物体数量数据
        knapsack(bag,v,w,volume);//实现
        System.out.println(bag[1][volume]);//输出最终结果
        traceback(bag,w,volume,x);//回溯实现结果存进数组x
        for(int i=1;i<v.length;i++) {
            System.out.print("物品"+i+":"+x[i]+" ");//输出各个物品置放情况
        }
    }

    /**
     * 动态规划解决0-1背包问题
     * @param bag
     * @param v
     * @param w
     * @param c
     */
    public static void knapsack(int[][] bag,int[] v,int[] w,int c){
        int n=v.length-1;
        int j_m=Math.min(w[n]-1,c);
        //边界条件
        for(int i=w[n];i<=c;i++){
            bag[n][i]=v[n];
        }
        for(int i=1;i<=j_m;i++){
            bag[n][i]=0;
        }
        //从下往上计算
        for(int i=n-1;i>0;i--){
            int j_m2=Math.max(w[i]-1,c);
            for(int j=1;j<=j_m2;j++){
                bag[i][j]=bag[i+1][j];
            }
            for(int j=w[i];j<=c;j++){
                bag[i][j]=Math.max(bag[i+1][j],bag[i+1][j-w[i]]+v[i]);
            }

        }
    }

    /**
     * 回溯出动态规划实现结果，把物品置放情况存进数组x
     * @param bag
     * @param w
     * @param c
     * @param x
     */
    public static void traceback(int[][] bag,int[] w,int c,int[] x ){
        int n=bag.length-1;
        for(int i=1;i<n;i++){
            if(bag[i][c]==bag[i+1][c]){
                x[i]=0;
            }else {
                x[i]=1;
                c-=w[i];
            }
        }
        x[n]=bag[n][c]>0?1:0;//这里有问题
    }
}