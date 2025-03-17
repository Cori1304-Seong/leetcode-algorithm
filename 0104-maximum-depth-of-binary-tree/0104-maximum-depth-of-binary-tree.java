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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        int depth = 0;

        if (root == null) return 0;

        queue.offer(root);

        while (!queue.isEmpty()){
             int size = queue.size();
            depth++; 
        
            // TreeNode currentNode = queue.poll();
            // if (currentNode.left != null) queue.offer(currentNode.left);
            // if (currentNode.right != null) queue.offer(currentNode.right);

           
           for (int i = 0; i < size; i++) {
               TreeNode current = queue.poll();
               if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }


        }
        return depth;
    }
}