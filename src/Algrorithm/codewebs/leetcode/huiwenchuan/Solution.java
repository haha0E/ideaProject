package Algrorithm.codewebs.leetcode.huiwenchuan;

import java.util.LinkedList;
import java.util.List;

//大写字母65-90，小写97-122,数字48-57
public class Solution {
    public boolean isPalindrome(String s) {
        boolean ans=true;
        List<Character> n=new LinkedList<Character>();
        s=s.toLowerCase();
        s=s.replaceAll(" ","");
        char[] c=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(c[i]<=122&&c[i]>=97){
                n.add(c[i]);
            }else if(c[i]<=57&&c[i]>=48){
                n.add(c[i]);
            }
        }
        for (int i = 0; i < n.size(); i++) {
            if(n.get(i)!=n.get(n.size()-i-1)){
                ans=false;
            }
        }
        return ans;
    }
}
