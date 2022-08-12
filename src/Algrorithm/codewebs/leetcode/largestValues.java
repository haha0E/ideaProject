package Algrorithm.codewebs.leetcode;


import java.util.ArrayList;
import java.util.List;

public class largestValues {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        List<Integer> ans = new ArrayList<Integer>();

        public List<Integer> largestValues(TreeNode root) {
            bfs(root, 0);
            return ans;
        }

        public void bfs(TreeNode node, int l) {
            if (node != null) {
                if(ans.size()+1>=l){
                    if(ans.get(l)< node.val){
                        ans.set(l, node.val);
                    }
                }else{
                    ans.add(node.val);
                }
                bfs(node.left,l+1);
                bfs(node.right,l+1);
            }
        }
    }
}
