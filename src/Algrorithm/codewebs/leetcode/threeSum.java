package Algrorithm.codewebs.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (nums[i] != first) {
                    int i1 = i + 1 < n ? i + 1 : n - 1;
                    int i2 = n - 1;
                    while (i2 > i1) {
                        if (nums[i1] != second) {
                            List<Integer> l = new ArrayList<>();
                            int sum = nums[i] + nums[i1] + nums[i2];
                            if (sum == 0) {
                                l.add(nums[i]);
                                l.add(nums[i1]);
                                l.add(nums[i2]);
                                first = nums[i];
                                second = nums[i1];
                                ans.add(l);
                                i1++;
                            } else if (sum > 0) {
                                i2--;
                            } else {
                                i1++;
                            }
                        }else {
                            i1++;
                        }
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] x = new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        Solution s = new Solution();
        System.out.println(s.threeSum(x));
    }
}
