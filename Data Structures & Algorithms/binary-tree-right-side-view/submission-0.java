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
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> answer = new ArrayList<Integer>();
        Queue<TreeNode> holder = new LinkedList<TreeNode>();
        if(root == null){
            return answer;
        }
        if(root.left == null && root.right == null){
            answer.add(root.val);
            return answer;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current = null;
            while(!queue.isEmpty()){
                current = queue.poll();
                if(current.left != null){
                    holder.offer(current.left);
                }
                if(current.right != null){
                    holder.offer(current.right);
                }
            }
            answer.add(current.val);
            queue = holder;
            holder = new LinkedList<TreeNode>();
        }
        return answer;
    }
}
