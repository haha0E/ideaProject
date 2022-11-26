package Interviewing.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    static int ans = Integer.MAX_VALUE;

    static int m;
    static int n;
    static char[][] board;
    static int[][] b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new char[m][n];
        b=new int[m][n];
        for (int i = 0; i < m; i++) {
            board[i] = sc.next().toCharArray();
        }
//        dfs(0, 0, 0, 0);

        System.out.println(ans);
    }

    static int[] bingx = {0, 1, 0, -1};
    static int[] bingy = {1, 0, -1, 0};
    static int[] max = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] may = {2, 1, -1, -2, -2, -1, 1, 2};

    //广度优先搜索
    public static int bfs() {
        List<int[]> nodes= new ArrayList<>();
        int x=0;
        int y=0;
        nodes.add(new int[]{x,y,0});
        nodes.add(null);
        int ans=0;
        boolean flag=true;
        int type=0;
        int changetime=0;
        while(!nodes.isEmpty()){
            int[] xy=nodes.remove(0);
            if(xy[0]==m-1&&xy[1]==n-1) {
                flag = false;
            }
            if(flag){
                if (board[xy[0]][xy[1]]== '.') {
                    if (type == 0) {
                        return 0;
                    } else {
                        for (int j = 0; j < max.length; j++) {
                            nodes.add(new int[]{x + max[j], y + may[j]});
                        }
                    }
                } else if (board[x][y] == 'S') {
                    for (int j = 0; j < bingx.length; j++) {
                        nodes.add(new int[]{x + bingx[j], y + bingy[j]});
                    }
                    for (int j = 0; j < max.length; j++) {
                        nodes.add(new int[]{x + max[j], y + may[j]});
                    }
                }
            }
        }
        return 0;
    }


    //深度优先搜索
    public static void dfs(int i, int x, int y, int type) {
        if (x == m - 1 && y == n - 1) {
            if (i < ans) {
                ans = i;
            }
        } else if (x <= m - 1 && x >= 0 && y >= 0 && y <= n - 1) {//在范围内
            //判断当前坐标的状态
            if (board[x][y] == '.') {
                board[x][y] = 'X';
                if (type == 0) {
                    for (int j = 0; j < bingx.length; j++) {
                        dfs(i + 1, x + bingx[j], y + bingy[j], type);
                    }
                } else {
                    for (int j = 0; j < max.length; j++) {
                        dfs(i + 1, x + max[j], y + may[j], type);
                    }
                }
                board[x][y] = '.';
            } else if (board[x][y] == 'S') {
                board[x][y] = 'X';
                //改种类
                //不改种类
                for (int j = 0; j < bingx.length; j++) {
                    dfs(type==0?i + 1:i+2, x + bingx[j], y + bingy[j], 0);
                }
                for (int j = 0; j < max.length; j++) {
                    dfs(type!=0?i + 1:i+2, x + max[j], y + may[j], 1);
                }
                board[x][y] = 'S';
            }
        }
    }
}
