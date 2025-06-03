https://leetcode.com/problems/binary-tree-inorder-traversal/

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return inorder(root,new ArrayList<>());
    }
    public List<Integer>inorder(TreeNode root,List<Integer>list){
        if(root==null) return list;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        return list;
    }
}
