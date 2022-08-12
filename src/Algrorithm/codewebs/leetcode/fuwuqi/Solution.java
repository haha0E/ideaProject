package Algrorithm.codewebs.leetcode.fuwuqi;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int[] end = new int[k];
        int[] cnt = new int[k];
        for (int i = 0; i < k; i++) {
            end[i] = 0;
            cnt[i] = 0;
        }
        int n = arrival.length;
        for (int i = 0; i < n; i++) {
            if (end[i % k] <= arrival[i]) {
                end[i % k] = arrival[i] + load[i];
                cnt[i % k]++;
            } else {
                for (int j = i; j < i + k; j++) {
                    if (end[j % k] <= arrival[i]) {
                        end[j % k] = arrival[i] + load[i];
                        cnt[j % k]++;
                    }
                }
            }
        }
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
            }
        }
        List<Integer> ans = new LinkedList<Integer>();
        for (int i = 0; i < k; i++) {
            if (cnt[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] arrival=new int[]{1,3,4,5,10,12};
        int[] loading=new int[]{11,9,3,1,9,12};
        System.out.println(solution.busiestServers(4,arrival,loading));
    }
}