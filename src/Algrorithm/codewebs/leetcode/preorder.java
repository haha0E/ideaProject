package Algrorithm.codewebs.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class preorder {
    public static void main(String[] args) {

    }

    public static List<Integer> preorder(Node root) {
        List<Integer> ans = new LinkedList<>();
        if(root==null){
            return ans;
        }
        ans.add(root.val);
        int n=root.children.size();
        for (int i = 0; i < n; i++) {
            ans.addAll(preorder(root.children.get(i)));
        }
        return ans;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
