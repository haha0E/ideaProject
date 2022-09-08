package Algrorithm.codewebs.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaxWidth {
    public static void main(String[] args) {
        MaxWidth x=new MaxWidth();
        TreeNode root=new TreeNode(10);
        System.out.println(x.widthOfBinaryTree(root));
    }
    public static class TreeNode {
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
    int ans=0;
    int floor=0;
    List<TreeNode> nodes=new ArrayList<>();
    public int widthOfBinaryTree(TreeNode root) {
        nodes.add(root);
        nodes.add(new TreeNode(101));
        dfs(root,1);
        int width=0;
        int all=0;
        System.out.println(floor);
        boolean flag=false;
        while(!nodes.isEmpty()){
            TreeNode t=nodes.remove(0);
            if(t.val==101){
                floor--;
                if(floor>0){
                    nodes.add(new TreeNode(101));
                }else{
                    break;
                }
                if(width>ans){
                    ans=width;
                }
                all=0;
                width=0;
                flag=false;
            }else{
                if(t.val!=-101){
                    flag=true;
                }
                if(flag){
                    all++;
                }
                if(t.val!=-101){
                    width=all;
                }
                nodes.add(t.left==null?new TreeNode(-101):t.left);
                nodes.add(t.right==null?new TreeNode(-101):t.right);
            }

        }
        return ans;
    }

    public void dfs(TreeNode root,int i){
        if(root!=null){
            if(i>floor){
                floor=i;
            }
            dfs(root.left,i+1);
            dfs(root.right,i+1);
        }
    }
}
