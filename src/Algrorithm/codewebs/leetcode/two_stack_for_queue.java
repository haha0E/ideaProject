package Algrorithm.codewebs.leetcode;

import java.util.Stack;

public class two_stack_for_queue {
    static class CQueue {
        Stack<Integer> in;
        Stack<Integer> out;

        public CQueue() {
            in=new Stack<Integer>();
            out=new Stack<Integer>();
        }

        public void appendTail(int value) {
            while(!out.empty()){
                in.push(out.pop());
            }
            in.push(value);
        }

        public int deleteHead() {
            while(!in.empty()){
                out.push(in.pop());
            }
            return out.pop();
        }
    }

    public static void main(String[] args) {
        CQueue cQueue=new CQueue();
        cQueue.appendTail(1);
        int x=cQueue.deleteHead();
        System.out.println(x);
    }
}
