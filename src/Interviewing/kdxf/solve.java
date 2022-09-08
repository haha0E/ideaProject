package Interviewing.kdxf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class solve {
    static int[][] board = new int[4][4];
    static List<int[]> road = new ArrayList<>();
    static List<int[]> ans = new ArrayList<>();
    static int length;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 8) {
                    x = i;
                    y = j;
                }
            }
        }
        road.add(new int[]{x, y});
        for (int i = 0; i < 4; i++) {
            dfs(x + xx[i], y + yy[i], 1);
        }
    }

    static int[] xx = new int[]{-1, 1, 0, 0};
    static int[] yy = new int[]{0, 0, -1, 1};

    public static void dfs(int x, int y, int i) {
        if ((x == 0 || x == 3 || y == 0 || y == 3) && board[x][y] == 0) {
            road.add(new int[]{x, y});
            if (ans.isEmpty()) {
                ans.addAll(road);
            } else if (ans.size()> road.size()) {
                ans.clear();
                ans.addAll(road);
            }
            road.remove(road.get(road.size()-1));
        } else if (board[x][y] < 1) {
            road.add(new int[]{x, y});
            board[x][y] = 1;
            for (int j = 0; j < 4; j++) {
                dfs(x + xx[j], y + yy[j], i + 1);
            }
            board[x][y] = 0;
            road.remove(road.get(road.size() - 1));
        }
    }
}
