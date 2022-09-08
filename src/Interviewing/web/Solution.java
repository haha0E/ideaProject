package Interviewing.web;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.DagpathNum(new int[][]{{1,2,3,4}, {2,4}, {3}, {}, {3,2}}));
    }

    public int[][] node;
    public int cnt = 0;

    public int DagpathNum(int[][] nodes) {
        node = nodes;
        for (int i = 0; i < nodes[0].length; i++) {
            dfs(0, i);
        }
        return cnt;
    }

    public void dfs(int i, int j) {
        if (node[i][j] == 4) {
            cnt++;
        } else {
            int n = node[node[i][j]].length;
            for (int k = 0; k < n; k++) {
                dfs(node[i][j], k);
            }
        }
    }

}
