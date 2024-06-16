package Grind_75_questions;

public class _110_Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {

        if (root == null) return true;

        if (!isBalanced(root.right) || !isBalanced(root.left)) return false;


        if (Math.abs(height(root.left) - height(root.right)) > 1) return false;

        return true;
    }


    static int height(TreeNode root) {

        if (root == null) return 0;


        int l = height(root.left);
        int r = height(root.right);


        return Math.max(l, r) + 1;

    }
}
