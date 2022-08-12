package Algrorithm.codewebs.leetcode.numEnclaves;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 主要题意
 * 找出被0包围的所有1
 * 大概就跟围棋的规则差不多
 * 该咋判断呢
 * 暴力不行（一圈一圈往里判定会出bug）
 * dfs可以解（找到1就往外搜，直到1的坐标到达边界为true
 * 力扣运行结果
 * 执行用时：287 ms, 在所有 Java 提交中击败了5.45%的用户
 * 内存消耗：174.5 MB, 在所有 Java 提交中击败了5.06%的用户
 * 我本来想用dfs解的，变成bfs了，离谱，复杂度很高
 */
public class solution {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}};
        int ans = numEnclaves(grid);
        System.out.println(ans);
    }

    public static int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] flag = new int[m][n];//判定结果
        int[][] f = new int[m][n];//是否入队
        Queue<int[]> x = new LinkedList<int[]>();
        Queue<int[]> y = new LinkedList<int[]>();//存储好一次判断的所有1的坐标
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flag[i][j] = -1;
                f[i][j] = -1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && f[i][j] == -1) {
                    x.add(new int[]{i, j});
                    boolean a = false;
                    while (!x.isEmpty()) {
                        int xx = x.peek()[0];
                        int yy = x.peek()[1];
                        if (xx == 0 || xx == m - 1 || yy == 0 || yy == n - 1) {
                            a = true;
                        }
                        y.add(new int[]{xx, yy});
                        f[xx][yy] = 1;
                        x.remove();
                        if (xx + 1 < m && grid[xx + 1][yy] == 1 && f[xx + 1][yy] != 1) {
                            x.add(new int[]{xx + 1, yy});
                        }
                        if (xx - 1 >= 0 && grid[xx - 1][yy] == 1 && f[xx - 1][yy] != 1) {
                            x.add(new int[]{xx - 1, yy});
                        }
                        if (yy - 1 >= 0 && grid[xx][yy - 1] == 1 && f[xx][yy - 1] != 1) {
                            x.add(new int[]{xx, yy - 1});
                        }
                        if (yy + 1 < n && grid[xx][yy + 1] == 1 && f[xx][yy + 1] != 1) {
                            x.add(new int[]{xx, yy + 1});
                        }
                    }
                    int ans = -1;
                    if (a) {
                        ans = 1;
                    } else {
                        ans = 0;
                    }
                    while (!y.isEmpty()) {
                        int xx = y.peek()[0];
                        int yy = y.peek()[1];
                        y.remove();
                        flag[xx][yy] = ans;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flag[i][j] == 0)
                    count++;
            }
        }
        return count;
    }
}
