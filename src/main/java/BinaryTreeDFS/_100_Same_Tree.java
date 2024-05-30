package BinaryTreeDFS;

public class _100_Same_Tree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        return (q.val == p.val) && isSameTree(q.left, p.left) && isSameTree(q.right, p.right);
    }

    public static void main(String[] args) {
        _100_Same_Tree checker = new _100_Same_Tree();

        // Tạo hai cây giống nhau
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);
        tree1.left.left = new TreeNode(4);
        tree1.left.right = new TreeNode(5);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);
        tree2.left.left = new TreeNode(4);
        tree2.left.right = new TreeNode(5);

        // Kiểm tra hai cây có giống nhau không
        boolean result = checker.isSameTree(tree1, tree2);
        System.out.println("Tree1 and Tree2 are the same: " + result);

        // Tạo hai cây khác nhau
        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(2);
        tree3.right = new TreeNode(3);

        TreeNode tree4 = new TreeNode(1);
        tree4.left = new TreeNode(2);
        tree4.right = new TreeNode(4);

        // Kiểm tra hai cây có giống nhau không
        result = checker.isSameTree(tree3, tree4);
        System.out.println("Tree3 and Tree4 are the same: " + result);
    }
}
