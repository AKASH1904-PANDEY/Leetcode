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
    int galat =0;
    TreeNode prev =null;
    TreeNode g1first = null;
    TreeNode g1second= null;
    TreeNode g2first = null;
    TreeNode g2second = null;
    public void recoverTree(TreeNode root) {
        recover(root);
         if (galat == 1) {
            int temp = g1first.val;
            g1first.val = g1first == null ? temp : g1second.val;
            g1second.val = temp;
        } else {
            int temp = g1first.val;
            g1first.val = g2second.val;
            g2second.val = temp;
        }
    }
    void recover(TreeNode root){
        if(root==null) return;

        recover(root.left);
        if(prev==null){
            prev=root;
        }else{
            if(prev.val>root.val){
               if(galat==0){
                g1first= prev;
                g1second = root;
                galat++;
               }
               else{
                 g2first= prev;
                 g2second = root;
                 galat++;
               }
            }
        }
        prev = root;
        recover(root.right);
    }
}