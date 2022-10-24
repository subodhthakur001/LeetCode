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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        double avg = 0;
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            List<Integer> res = new ArrayList<>();
            for(int i=0;i<k;i++){
                TreeNode curr = q.remove();
                 res.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            double sum = 0;
            for(Integer s : res){
                sum = sum +s;
                avg = sum / res.size();   
            }
            ans.add(avg);
        }
        return ans;
    }
}