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
    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        _110_Balanced_Binary_Tree tree = new _110_Balanced_Binary_Tree();
        System.out.println(tree.isBalanced(root));  // Output: false
    }
}
