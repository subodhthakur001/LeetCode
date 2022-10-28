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
/*RECURSIVE CODE*/
/*class Solution {
    public void preorder(TreeNode root,List<Integer> ans){
        if(root==null)return;
        else{
            ans.add(root.val);
            preorder(root.left,ans);
            preorder(root.right,ans);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }
}*/

/*ITERATIVE METHOD*/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root==null)return res;
        st.push(root);
        while(!st.empty()){
            root = st.pop();
            res.add(root.val);
            if(root.right!=null)st.push(root.right);
            if(root.left!=null)st.push(root.left);
        }
        return res;
    }
}