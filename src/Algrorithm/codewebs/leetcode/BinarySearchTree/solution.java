package Algrorithm.codewebs.leetcode.BinarySearchTree;



public class solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        TreeNode root=new TreeNode(nums[n/2]);
        int r=n/2;
        TreeNode left=root.left;
        TreeNode tt=root;
        for(int i=r;i>=0;i--){
            left= new TreeNode(nums[i]);
            tt=left.left;
            left=tt;
        }
        r=n/2;
        root.right=new TreeNode(nums[++r]);
        TreeNode temp=root.right.left;
        TreeNode tem=root;
        for(int i=r;i<n;i++){
            temp=new TreeNode(nums[r]);
            tt=temp.left;
            temp=tt;
        }
        return root;
    }
}
