package Algrorithm.codewebs.leetcode;


import java.util.*;

public class findshortestTree {
    static class Solution {
        //纯暴力浪费很多时间
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            int i=0;
            int[] hights=new int [n];
            int min=Integer.MAX_VALUE;
            List<Integer>[] queue=new List[n];
            List<Integer> ans=new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                queue[j]=new ArrayList<Integer>();
            }
            if (n == 1) {
                ans.add(0);
                return ans;
            }
            if(n==2){
                ans.add(0);
                ans.add(1);
                return ans;
            }
            for(int j=0;j<edges.length;j++){
                queue[edges[j][0]].add(edges[j][1]);
                queue[edges[j][1]].add(edges[j][0]);
            }
            while(i<n){
                if(queue[i].size()<Math.sqrt(n)){
                    i++;
                    continue;
                }
                List<Integer> x=new ArrayList<Integer>();
                x.add(i);
                x.add(null);
                int h=0;
                boolean[] flag=new boolean[n];
                flag[i]=true;
                //队列式bfs，有下一层就可以加null，没下一层就把剩下的节点搞出来
                while(!x.isEmpty()){
                    Integer now=x.remove(0);
                    if(now!=null){
                        for(int t:queue[now]){
                            if(!flag[t]){
                                x.add(t);
                                flag[t]=true;
                            }
                        }
                    }else if(!x.isEmpty()){//为空
                        h++;
                        x.add(null);
                    }
                }
                hights[i]=h;
                if(h<min) min=h;
                i++;
            }

            for(int j=0;j<n;j++){
                if(hights[j]==min){
                    ans.add(j);
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        List<Integer> ans=solution.findMinHeightTrees(4,new int[][]{{1,2},{1,3},{0,1}});
        System.out.println(ans);
    }
}
