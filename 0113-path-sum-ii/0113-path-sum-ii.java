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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        path(root,targetSum,new ArrayList<>());
        return res;
    }
    void path(TreeNode root,int sum ,List<Integer>temp){
        if(root==null) return;
        temp.add(root.val);
        sum-=root.val;

        if(root.left==null && root.right==null){
            if(sum==0){
                res.add(new ArrayList<>(temp));
            }
        }else{
            path(root.left,sum,temp);
            path(root.right,sum,temp);
        }
        temp.remove(temp.size()-1);
    }
}