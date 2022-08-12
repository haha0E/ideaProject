package Algrorithm.Vol.IV_Greedy;

import java.util.Scanner;

public class ShortestRoad {
    final static int m = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] s = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 4, m, m, m},
                {0, m, 0, 1, 9, 4, m},
                {0, m, m, 0, 5, 13, m},
                {0, m, m, m, 0, m, 8},
                {0, m, m, m, 12, 0, 10},
                {0, m, m, m, m, m, 0},
        };
        int[] dist = new int[s.length];
        int[] prev = new int[s.length];
        System.out.println("请输入作为源的顶点（整数）：");
        int v = sc.nextInt();
        try {
            dijkstra(s, dist, v, prev);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //输出最短路
        int target=m;
        while(true) {
            System.out.println("请输入想要查询最短路的节点(输入0为结束查询)：");
            target = sc.nextInt();
            if(target==0){
                break;
            }
            String ans = String.valueOf(target);
            System.out.println(v+"与"+target+"的距离为"+dist[target]);
            while (prev[target] != v) {
                ans = prev[target] + "->" + ans;
                target = prev[target];
            }
            ans = v + "->" + ans;
            System.out.println("最短路如下：");
            System.out.println(ans);

        } 
    }

    /**
     * dijkstra算法解决单源最短路问题
     *
     * @param s    有向图的邻接矩阵
     * @param dist 顶点v到其他顶点的距离
     * @param v    以顶点v作为初始源
     * @param prev prev[i]表示顶点i的前一个节点
     */
    public static void dijkstra(int[][] s, int[] dist, int v, int[] prev) throws Exception {
        int n = dist.length - 1;
        if (v < 1 || v > n) {
            throw new IndexOutOfBoundsException("作为源的点不在图的范围内");
        }
        boolean[] ss = new boolean[n + 1];//判断是否进入源的数组
        //初始化
        for (int i = 1; i <= n; i++) {
            dist[i] = s[v][i];
            ss[i] = false;//全部设为false
            if (dist[i] == m)//第一轮dist的判断
                prev[i] = 0;
            else
                prev[i] = v;
        }
        dist[v] = 0;
        ss[v] = true;
        for (int i = 1; i < n; i++) {
            int temp = m;
            int k = v;
            for (int j = 1; j <= n; j++) {
                if ((!ss[j]) && temp > dist[j]) {
                    temp = dist[j];
                    k = j;
                }
            }
            ss[k] = true;
            for (int j = 1; j <= n; j++) {
                int newdist=m;
                if ((!ss[j]) && m > s[k][j]) {
                    newdist=dist[k]+s[k][j];
                    if(newdist<dist[j]){
                        dist[j]=newdist;
                        prev[j]=k;
                    }
                }
            }
        }
    }
}
