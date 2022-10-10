/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void postorder(Node root, List<Integer> ans){
        for(Node child : root.children){
            postorder(child,ans);
        }
        ans.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root==null)return res;
        postorder(root,res);
        return res;
    }
}