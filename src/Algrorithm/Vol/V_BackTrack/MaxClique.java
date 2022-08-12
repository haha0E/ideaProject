package Algrorithm.Vol.V_BackTrack;

public class MaxClique {
    static int[] x;//当前解
    static int[][] g;//解的邻接矩阵
    static int n;//图的节点个数
    static int besta;//当前解最大节点个数
    static int [] bestx;//当前解最大节点集合
    static int cn;//当前顶点数
    //初始化方法

    /**
     *
     * @return besta 使用回溯方法之后得到的最优解
     */
    public static int maxClique(int[] v){
        x=new int[n+1];
        besta=0;
        bestx=v;
        cn=0;
        backtrack(1);
        return besta;
    }
    public static void backtrack(int i){
        if(i>n){
            for (int j = 0; j < n; j++) {
                bestx[j]=x[j];
            }
            besta=cn;
            return;
        }
        boolean ok=true;
        for (int j = 1; j <i; j++) {
            if(x[j]==1&&g[i][j]!=1){
                ok=false;
                break;
            }
        }
        if(ok){
            x[i]=1;//进入右子树
            cn++;
            backtrack(i+1);
            cn--;
        }else{
//        if(cn+n-i>besta){
            x[i]=0;//进入左子树
            backtrack(i+1);
        }
    }

    public static void main(String[] args) {
        int[][] gg={
                {0,0,0,0,0,0,0},
                {0,0,1,0,1,1,1},
                {0,1,0,1,1,1,0},
                {0,0,1,0,1,0,0},
                {0,1,1,1,0,1,0},
                {0,1,1,0,1,0,1},
                {0,1,0,0,0,1,0},
        };
        g=gg;
        n=6;
        maxClique(new int[gg.length]);
        System.out.print("最大团包含的节点有：");
        for (int i = 1; i <=n ; i++) {
            if(bestx[i]==1)
            System.out.print(i+" ");
        }
    }
}
