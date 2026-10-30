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
    public boolean findTarget(TreeNode root, int k) {

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        TreeNode curr1 = root;
        TreeNode curr2 = root;

        // Initialize both iterators
        while (curr1 != null) {
            s1.push(curr1);
            curr1 = curr1.left;
        }

        while (curr2 != null) {
            s2.push(curr2);
            curr2 = curr2.right;
        }

        while (!s1.isEmpty() && !s2.isEmpty()) {

            TreeNode left = s1.peek();
            TreeNode right = s2.peek();

            // Avoid using the same node twice
            if (left == right) {
                return false;
            }

            int sum = left.val + right.val;

            if (sum == k) {
                return true;
            }

            // Move ascending iterator forward
            if (sum < k) {
                TreeNode node = s1.pop();

                node = node.right;

                while (node != null) {
                    s1.push(node);
                    node = node.left;
                }
            }

            // Move descending iterator backward
            else {
                TreeNode node = s2.pop();

                node = node.left;

                while (node != null) {
                    s2.push(node);
                    node = node.right;
                }
            }
        }

        return false;
    }
}
