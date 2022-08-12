package Algrorithm.Vol.IV_Greedy;

public class MinimumSpanningTree {
    final static int m=Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[][] g = {
                {0, 34, m, m, 12, m},
                {34, 0, 46, m, m, 19},
                {m, 46, 0, 17, m, 25},
                {m, m, 17, 0, 38, 25},
                {12, m, m, 38, 0, 26},
                {m, 19, 25, 25, 26, 0},
        };
        int n=g.length;
        prim(n,g);
    }

    /**
     * prim算法解决最小生成树问题
     * @param n
     * @param g
     */
    public static void prim(int n,int[][] g){
        int[] lowcost=new int[n];
        int[] closeset=new int[n];
        boolean[] s=new boolean[n];
        s[0]=true;
        for(int i=1;i<n;i++){
            lowcost[i]=g[0][i];
            closeset[i]=0;
            s[i]=false;
        }
        for(int i=0;i<n-1;i++){
            int temp=m;
            int k=0;
            for(int j=1;j<n;j++){
                if((!s[j])&&lowcost[j]<temp){
                    k=j;
                    temp=lowcost[j];
                }
            }
            System.out.println(k+"，"+closeset[k]);
            s[k]=true;
            for(int j=1;j<n;j++){
                if(g[k][j]<lowcost[j]&&(!s[j])){
                    lowcost[j]=g[k][j];
                    closeset[j]=k;
                }
            }
        }

    }
}
