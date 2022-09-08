package Interviewing.web;

public class solu {
    public static void main(String[] args) {
        solu solution = new solu();
        System.out.println(solution.DagpathNum(new int[][]{{1,2,3}, {3}, {3}, {4}, {}}));
    }
    int res=0;
    static int[][] a=new int[5][5];
    int[] cnt=new int[10];
    public void dfs(int x){
        if (x == 4) {
            res++;
            return;
        }
        for (int i = 0; i < cnt[x]; i++) {
            dfs(a[x][i]);
        }
    }
    public int DagpathNum(int[][] nodes) {
        for (int i = 0; i < nodes.length; i++) {
            for (int j = 0; j < nodes[i].length; j++) {
                a[i][cnt[i]]=nodes[i][j];
                cnt[i]++;
            }
        }
        dfs(0);
        return res;
    }

}
