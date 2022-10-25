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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String s = "";
        if(root!=null)bt(ans,root,s);
        return ans;
    }
    public void bt(List<String> ans, TreeNode root, String s){
        if(root.left==null && root.right==null)ans.add(s + root.val + "");
        if(root.left!=null)bt(ans,root.left,s+root.val+"->");
        if(root.right!=null)bt(ans,root.right,s+root.val+"->");
    }
}