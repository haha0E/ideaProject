package Algrorithm.codewebs.leetcode;

import java.util.ArrayList;
import java.util.List;

public class makse {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findSubsequences(new int[]{4, 6, 7, 7}));
    }

    static class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        int n;
        List<Integer> temp = new ArrayList<>();
        List<Integer> begin = new ArrayList<>();
        int prevalue = Integer.MIN_VALUE;

        public List<List<Integer>> findSubsequences(int[] nums) {
            n = nums.length;
            dfs(0, nums);
            return ans;
        }

        public void dfs(int i, int[] x) {
            int l = temp.size();
            if (i > n - 1 || (l != 0 && temp.get(l - 1) > x[i])) {
                return;
            }
            for (; i < n; i++) {
                temp.add(x[i]);
                if (temp.size() >= 2) {
                    ans.add(new ArrayList<>(temp));
                }
                dfs(i + 1, x);
                temp.remove(l);
            }

        }
    }
}
