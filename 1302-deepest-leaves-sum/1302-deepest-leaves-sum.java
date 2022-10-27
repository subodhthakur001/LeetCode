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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)return 0;
        TreeMap<Integer,List<Integer>> tm = new TreeMap<>();
        int count = 1;
        helper(root,tm,count);
        int last = tm.lastKey();
        List<Integer> ans = tm.get(last);
        int sum =0;
        for(Integer i : ans){
            sum += i;
        }
        return sum;
    }
    
    public void helper(TreeNode root,TreeMap<Integer,List<Integer>> tm, int count){
        if(root.left==null && root.right==null){
            if(!tm.containsKey(count)){
                List<Integer> res = new ArrayList<>();
                res.add(root.val);
                tm.put(count,res);
            }
            else{
                tm.get(count).add(root.val);
            }
        }
        if(root.left!=null)helper(root.left,tm,count+1);
        if(root.right!=null)helper(root.right,tm,count+1);
    }
}