package Algrorithm.codewebs.leetcode.kaoshikunrao;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int left=0;
        int right=0;
        int ans=0;
        char[] c=answerKey.toCharArray();
        List<Integer> other=new ArrayList<Integer>();
        for(int i=0;i<c.length;i++){
            if(c[i]=='T'){
                other.add(i);
            }
            if(other.size()>k){
                left=other.get(0)+1;
                other.remove(0);
            }
            if(right-left+1>ans){
                ans=right-left+1;
            }
            right++;
        }
        left=0;
        right=0;
        other.clear();
        for(int i=0;i<c.length;i++){
            if(c[i]=='F'){
                other.add(i);
            }
            if(other.size()>k){
                left=other.get(0)+1;
                other.remove(0);
            }
            if(right-left+1>ans){
                ans=right-left+1;
            }
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutiveAnswers("FFTFTTTFFF"
        ,1));
    }
}