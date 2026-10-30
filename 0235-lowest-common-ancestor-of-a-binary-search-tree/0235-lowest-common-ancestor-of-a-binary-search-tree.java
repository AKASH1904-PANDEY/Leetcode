/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca(root,p,q);
        return ans;
    }
    void lca(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return;
        if(root==p || root==q){
            ans = root;
            return ;
        }
        if(root.val<p.val && root.val<q.val){
            lca(root.right,p,q);
        }
        if(root.val>p.val && root.val>q.val){
            lca(root.left,p,q);
        }
        if(root.val>p.val && root.val<q.val){
            ans =root;
            return;
        }
        if(root.val<p.val && root.val>q.val){
            ans =root;
            return;
        }
       
        
    }
}