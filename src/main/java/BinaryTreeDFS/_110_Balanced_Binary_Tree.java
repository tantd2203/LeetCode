package BinaryTreeDFS;

public class _110_Balanced_Binary_Tree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        if (!isBalanced(root.left) || !isBalanced(root.right)) {
            return false;
        }
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }
        return true;
    }

    public int height(TreeNode node) {
        if (node == null) return 0;

        int l = height(node.left);
        int r = height(node.right);

        return Math.max(l, r) + 1;
    }
}
