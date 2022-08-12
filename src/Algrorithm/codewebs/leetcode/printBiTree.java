package Algrorithm.codewebs.leetcode;

import java.util.ArrayList;
import java.util.List;

public class printBiTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<TreeNode> nodes = new ArrayList<TreeNode>();
    public List<Integer> layout = new ArrayList<Integer>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        nodes.add(root);
        nodes.add(null);
        while (!nodes.isEmpty()) {
            TreeNode x = nodes.remove(0);
            if (x != null) {
                layout.add(x.val);
                if (x.left != null) {
                    nodes.add(x.left);
                }
                if (x.right != null) {
                    nodes.add(x.right);
                }
            } else if (!nodes.isEmpty()) {
                ans.add(layout);
                layout=new ArrayList<Integer>();
                nodes.add(null);
            }
        }
        return ans;
    }
}
