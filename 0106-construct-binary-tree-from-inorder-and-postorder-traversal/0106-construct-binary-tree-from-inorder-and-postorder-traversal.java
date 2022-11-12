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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length)return null;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
       return construction(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hm);
    }
    public TreeNode construction(int[] inorder,int instart,int inend,int[] postorder,int postart,int postend,HashMap<Integer,Integer> hm){
        if(instart>inend || postart >postend)return null;
        TreeNode root = new TreeNode(postorder[postend]);
        int inroot = hm.get(root.val);
        int numsleft = inroot - instart;
        root.left = construction(inorder,instart,inroot-1,postorder,postart,postart+numsleft-1,hm);
        root.right=construction(inorder,inroot+1,inend,postorder,postart+numsleft,postend-1,hm);
        return root;
    }
}