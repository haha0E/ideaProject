package Algrorithm.codewebs.leetcode;


import java.util.*;

public class jump {
    Queue<Integer> forward=new LinkedList<>();
    public int Jump(int[] nums) {
        int count=0;
        forward.add(0);
        forward.add(Integer.MAX_VALUE);
        while(!forward.isEmpty()){
            int x=forward.remove();
            if(x!=Integer.MAX_VALUE) {
                if(x== nums.length-1){
                    break;
                }
                for (int i = 1; i <= nums[x]; i++)
                    if(!forward.contains(x+i)) {
                        forward.add(x + i);
                    }
            }else {
                count++;
                if(!forward.isEmpty())
                    forward.add(Integer.MAX_VALUE);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        jump jump=new jump();
        System.out.println(jump.Jump(new int[]{2,3,1,1,4}));
    }
}
