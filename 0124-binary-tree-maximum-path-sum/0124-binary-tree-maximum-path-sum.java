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
/*class Solution {
    public int maxPathSum(TreeNode root) {
        int[] maxsum = new int[1];
        maxsum[0] = Integer.MIN_VALUE;
        pathsum(root,maxsum);
        return maxsum[0];
    }
    public int pathsum(TreeNode root, int[] maxsum){
        if(root==null)return 0;
        int ls = pathsum(root.left,maxsum);
        if(ls<0)return 0;
        int rs = pathsum(root.right,maxsum);
        if(rs<0)return 0;
        maxsum[0] = Math.max(maxsum[0],ls+rs+root.val);
        return Math.max(ls,rs) + root.val;
    }
}*/

class Solution {
    public int maxPathSum(TreeNode root) {
        int[] maxsum = new int[1];
        maxsum[0] = Integer.MIN_VALUE;
        pathsum(root,maxsum);
        return maxsum[0];
    }
    public int pathsum(TreeNode root, int[] maxsum){
        if(root==null)return 0;
        int ls = Math.max(0,pathsum(root.left,maxsum));
        int rs = Math.max(0,pathsum(root.right,maxsum));
        maxsum[0]=Math.max(maxsum[0],ls+rs+root.val);
        return Math.max(ls,rs)+root.val;
    }
}