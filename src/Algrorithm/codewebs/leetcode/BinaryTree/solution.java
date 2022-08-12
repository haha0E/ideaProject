package Algrorithm.codewebs.leetcode.BinaryTree;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> r= List(root);
        int n=r.size();
        int [] x=new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=r.poll().val;
        }
        int pp=p.val;
        int qq=q.val;
        return root;
    }
    public LinkedList<TreeNode> List(TreeNode root){
        LinkedList<TreeNode> x=new LinkedList<TreeNode>();
        LinkedList<TreeNode> f=new LinkedList<TreeNode>();
        f.push(root);
        while(f.isEmpty()){
            TreeNode temp=f.poll();
            x.push(temp);
            f.push(temp.left);
            f.push(temp.right);
        }
        return x;
    }
    public static void main(String[] args){
        TreeNode root =new TreeNode(6);
        LinkedList<Object> x=new LinkedList<Object>();
        Object [] c=new Object[]{6,2,8,0,4,7,9,null,null,3,5};
        for (int i = 0; i < c.length; i++) {
            x.push(c[i]);
        }

    }
}
