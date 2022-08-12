package Algrorithm.codewebs.leetcode.levelOrder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();

        return null;
    }
}
