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
    public int goodNodes(TreeNode root) {
        
        return DFS(root, root.val);
    }

    private int DFS(TreeNode node, int max ){
        int count= 0;
        if (node == null) return 0;

        if (max <= node.val) count++;

        int newMax = Math.max(node.val, max);

        count += DFS(node.left, newMax);
        count += DFS(node.right, newMax);

        return count ;
    }
}