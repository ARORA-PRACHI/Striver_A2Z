https://leetcode.com/problems/binary-tree-postorder-traversal/


class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        return postorder(root,new ArrayList<>());
    }
    public List<Integer> postorder(TreeNode root,List<Integer>list){
        if(root==null) return list;
        postorder(root.left,list);
        postorder(root.right,list);
        list.add(root.val);
        return list;
    }
}
