package Algrorithm.codewebs.leetcode.baseball;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class solution {
    public static int calPoints(String[] ops) {
        int ans=0;
        int n=ops.length;
        List<Integer> re=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(ops[i].equals("+")){
                re.add(re.get(re.size()-1)+re.get(re.size()-2));
            }else if(ops[i].equals("D")){
                re.add(re.get(re.size()-1)*2);
            }else if(ops[i].equals("D")){
                re.remove(re.size()-1);
            }else{
                re.add(Integer.parseInt(ops[i]));
            }
        }
        while(!re.isEmpty()){
            ans+=re.remove(0);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","-2","4","D","D","9","+","+"}));
    }
}
