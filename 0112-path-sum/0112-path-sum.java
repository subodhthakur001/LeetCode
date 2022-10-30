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
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        target = targetSum;
        return dfs(root, 0);
    }
    
    public boolean dfs(TreeNode root, int sum){
        sum+=root.val;
        if(root.left==null && root.right==null) return sum==target;
        boolean result = false;
        if(root.left!=null)
            result = result || dfs(root.left, sum);
        if(!result && root.right!=null)
            result = dfs(root.right, sum);
        return result;
    }
} */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null)return (targetSum-root.val) == 0;
        
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        }
}