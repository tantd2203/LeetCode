package BinaryTreeDFS;

class _104_Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {

        // max depth find height for root
        // case for beak
        if (root == null) {
            return 0;
        }
//        case recursive
        int heightL = maxDepth(root.left);
        int heightR = maxDepth(root.right);
        int result = Math.max(heightR, heightL) + 1;
        return result;
    }
}
