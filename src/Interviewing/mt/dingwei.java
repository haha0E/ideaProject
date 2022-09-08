package Interviewing.mt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dingwei {
    static int[][] b;
    static List<int[]> tar = new ArrayList<int[]>();
    static List<int[]> ans = new ArrayList<int[]>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        int[][] xy = new int[3][2];
        for (int i = 0; i < 3; i++) {
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }
        b=board;
        int[] man = new int[3];
        for (int i = 0; i < 3; i++) {
            man[i] = sc.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            dfs(man[i], xy[i][0], xy[i][1], n);
        }
        for(int i=0;i< tar.size();i++){
            int m1=Math.abs(tar.get(i)[1] - xy[1][1]) + Math.abs(tar.get(i)[0] - xy[1][0]);
            int m2=Math.abs(tar.get(i)[1] - xy[0][1]) + Math.abs(tar.get(i)[0] - xy[0][0]);
            if(m1==man[1]&&m2==man[0]){
                ans.add(tar.get(i));
            }
        }
        int ax = Integer.MAX_VALUE;
        int ay = Integer.MAX_VALUE;
        for (int i = 0; i < ans.size(); i++) {
            int man3=Math.abs(ans.get(i)[1] - xy[2][1]) + Math.abs(ans.get(i)[0] - xy[2][0]);
            if (man3 == man[2]) {
                if(ans.get(i)[0]<ax) {
                    ax = ans.get(i)[0];
                    ay = ans.get(i)[1];
                }else if(ans.get(i)[0]==ax&&ans.get(i)[1]<ay){
                    ax = ans.get(i)[0];
                    ay = ans.get(i)[1];
                }
            }
        }
        System.out.println(ax + " " + ay);
    }

    public static void dfs(int dis, int x, int y,int n) {
        if (dis == 0) {
            if(x>=0&&x<n&&y>=0&&y<n&&b[x][y]==0) {
                tar.add(new int[]{x+1, y+1});
                b[x][y]=1;
            }
        } else {
            int[] xx = new int[]{0, 1, 0, -1};
            int[] yy = new int[]{1, 0, -1, 0};
            for (int i = 0; i < 4; i++) {
                dfs(dis - 1, x + xx[i], y + yy[i],n);
            }
        }
    }
}
