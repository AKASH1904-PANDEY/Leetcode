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
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1,map);
    }
    private TreeNode build(int[] preorder,int low,int high,HashMap<Integer,Integer> map){
        if(low>high) return null;
        int rootVal = preorder[index++];
        TreeNode node = new TreeNode(rootVal);

        int inorderidx = map.get(rootVal);

        node.left = build(preorder,low,inorderidx-1,map);
        node.right = build(preorder,inorderidx+1,high,map);

        return node;
    }
}