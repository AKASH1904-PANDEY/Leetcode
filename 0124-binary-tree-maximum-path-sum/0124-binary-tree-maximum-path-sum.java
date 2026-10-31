/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        path(root);
        return ans;
    }
    int path(TreeNode root){
        if(root==null) return 0;

        int left = Math.max(path(root.left),0);
        int right = Math.max(path(root.right),0);

        int sum = root.val +left+right;

        ans = Math.max(ans,sum);

        return root.val + Math.max(left,right);
    }
}