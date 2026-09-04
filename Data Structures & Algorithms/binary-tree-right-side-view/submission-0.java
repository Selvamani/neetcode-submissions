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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> results =  new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) { 
            TreeNode rightNode = null;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if(node!=null) {
                    rightNode = node;
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if(rightNode!=null) {
                results.add(rightNode.val);
            }
        }
        return results;
    }
}
