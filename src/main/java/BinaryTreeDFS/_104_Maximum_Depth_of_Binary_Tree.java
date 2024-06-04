package BinaryTreeDFS;

class _104_Maximum_Depth_of_Binary_Tree {
    public static int maxDepth(TreeNode root) {

        // max depth find height for root
        // case for beak
        if (root == null) {
            return 0;
        }
        //       case recursive
        int heightL = maxDepth(root.left);
        int heightR = maxDepth(root.right);
        int result = Math.max(heightR, heightL) + 1;
        return result;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, node3);
        TreeNode node7 = new TreeNode(7);
        TreeNode root = new TreeNode(4, node2, node7);

        System.out.println(maxDepth(root));

    }
}
