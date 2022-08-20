package Interviewing.c4399;

import java.util.Stack;

public class A {
    public static void main(String[] args) {
        System.out.println(judge(new int[]{1,2,3,4},new int[]{2,1,4,3}));

    }
    public static boolean judge(int[] in, int[] out){
        int indexin=0;
        int indexout=0;
        int n=out.length;
        Stack<Integer> s=new Stack<Integer>();
        while(indexout<n){
            if(!s.empty()&&s.peek()==out[indexout]){
                s.pop();
                indexout++;
            }else{
                if(indexin>=in.length){
                    return false;
                }
                s.push(in[indexin]);
                indexin++;
            }
        }
        return true;

    }
}
