package BinaryTreeDFS;

public class _101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {


        return mirrorTree(root,root);
    }

    public boolean mirrorTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return true;

        return (t1.val == t2.val) && mirrorTree(t1.left, t2.right) && mirrorTree(t1.right, t2.left);
    }

    public static void main(String[] args) {
        _101_Symmetric_Tree tree = new _101_Symmetric_Tree();

        // Example usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(tree.isSymmetric(root)); // Should print true
    }
}
