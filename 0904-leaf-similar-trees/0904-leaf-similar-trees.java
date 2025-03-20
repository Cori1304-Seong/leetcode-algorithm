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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList();
         List<Integer> list2 = new ArrayList();
        // List<Integer> values = new LinkedList();

      
        DFS(root1, list1);
        DFS(root2, list2);

        // int[] arr1 = list1.stream().mapToInt(Integer::intValue).toArray();
        int[] arr1 = list1.stream().mapToInt(Integer::intValue).toArray();
        int[] arr2 = list2.stream().mapToInt(Integer::intValue).toArray();


        System.out.println("root1: " + Arrays.toString(arr1));
        System.out.println("root2: " + Arrays.toString(arr2));

      


        return Arrays.equals(arr1, arr2);

        
    }

    private void DFS(TreeNode node, List list){
        if (node == null) return;


        if (node.left!= null )  DFS(node.left, list);

        if (node.right!= null )  DFS(node.right, list);

        if (node.left == null && node.right == null) list.add(node.val);
    }
}