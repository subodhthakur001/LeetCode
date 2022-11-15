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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int leftheight = 1;
        TreeNode l = root.left;
        while(l!=null){
            l = l.left;
            leftheight++;
        }
        int rightheight =1;
        TreeNode r = root.right;
        while(r!=null){
            r=r.right;
            rightheight++;
            
        }
        if(leftheight==rightheight){
            int ans= (int)Math.pow(2,leftheight)-1;
            return ans;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}