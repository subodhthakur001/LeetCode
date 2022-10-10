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
/*
T.C. -> O(N)
S.C. -> O(1)
*/
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        int lh = minDepth(root.left);
        int rh = minDepth(root.right);
        if(root.left== null && root.right!=null)
            return 1 + rh;
        if(root.right==null && root.left!=null)
            return 1 +lh;
        
        return Math.min(lh,rh)+1;
    }
}