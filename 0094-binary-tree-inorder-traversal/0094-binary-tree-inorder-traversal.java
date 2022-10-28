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
/*RECURSIVE METHOD*/
/*class Solution {
    public void inorder(TreeNode root, List<Integer> ans){
        if(root==null)return;
        else{
            inorder(root.left,ans);
            ans.add(root.val);
            inorder(root.right,ans);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
}
/*ITERATIVE METHOD*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                res.add(node.val);
                node = node.right;
            }
        }
        return res;
    }
}
