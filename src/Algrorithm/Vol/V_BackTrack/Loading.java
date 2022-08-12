package Algrorithm.Vol.V_BackTrack;

import java.util.Arrays;

public class Loading {
    static int n;//集装箱数
    static int c;//第一艘船装载量
    static int cw;//current weight当前载重量
    static int bestw;//当前最优载重量
    static int r;//剩余载重量
    static int[] w;//重量数组
    static int[] x;//当前解
    static int[] bestx;//当前最优解
    public static int  MaxLoading(int[] ww,int cc,int []xx){
        n=ww.length-1;
        w=ww;
        c=cc;
        x=new int[n+1];
        cw=0;
        bestw=0;
        bestx=xx;
        for (int a: w) {
            r+=a;
        }
        backtrack(1);
        return bestw;
    }


    public static void backtrack(int i){
        if(i>n){
            if(cw>bestw) {
                for (int j = 1; j <= n; j++)
                    bestx[j] = x[j];
                bestw = cw;
            }
            return;
        }
        r-=w[i];
        if(cw+w[i]<=c){
            x[i]=1;
            cw+=w[i];
            backtrack(i+1);
            cw-=w[i];
        }
        if(cw+r>bestw){
            x[i]=0;
            backtrack(i+1);
        }
        r+=w[i];
    }
    public static void main(String[] args) {
        int n=4;
        int c1=10;
        int c2=12;
        int []w={0,5,2,1,3};
        int ans= MaxLoading(w,c1,new int[n+1]);
        System.out.println("第一艘船的（最佳载重量/最大载重量）为："+ans+"/"+c1);
        for(int i=1;i<=n;i++){
            if(bestx[i]==1)
                System.out.println("第"+i+"物品的装载量："+bestx[i]);
        }
        System.out.println("第二艘船的（载重量/最大载重量）为："+(r-bestw)+"/"+c2);
        for(int i=1;i<=n;i++){
            if(bestx[i]==0)
                System.out.println("第"+i+"物品的装载量："+1);
        }
    }

}
