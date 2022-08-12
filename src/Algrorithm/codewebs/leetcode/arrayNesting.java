package Algrorithm.codewebs.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class arrayNesting {
    static class solution{
        public int arrayNesting(int[] nums) {
            int n= nums.length;
            int ans=0;
            HashMap<Integer,Integer> nest=new HashMap<Integer,Integer>();
            for (int i = 0; i < n; i++) {
                int index=i;
                while(!nest.containsKey(index)){
                    nest.put(index,nums[index]);
                    index=nums[index];
                }
                if(nest.size()>ans){
                    ans=nest.size();
                }
                nest=new HashMap<Integer,Integer>();
            }
            return ans;
        }
    }

     public static void main(String[] args){
        int[] a=new int[]{5,4,0,3,1,6,2};
        solution s=new solution();
        int x=s.arrayNesting(a);
        System.out.println(x);
     }
}
