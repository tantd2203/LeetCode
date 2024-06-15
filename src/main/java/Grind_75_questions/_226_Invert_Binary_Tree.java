package Grind_75_questions;

public class _226_Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
/*
 * swap value of node
 *
 *
 * */