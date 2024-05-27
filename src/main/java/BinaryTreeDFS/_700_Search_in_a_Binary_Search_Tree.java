package BinaryTreeDFS;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class _700_Search_in_a_Binary_Search_Tree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (val > root.val) return searchBST(root.right, val);
        else if (val < root.val) {
            return searchBST(root.left, val);
        } else return root;
    }

    public static void main(String[] args) {
        // Constructing a sample BST
        //         4
        //        / \
        //       2   7
        //      / \
        //     1   3
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, node3);
        TreeNode node7 = new TreeNode(7);
        TreeNode root = new TreeNode(4, node2, node7);

        // Creating an instance of the searchBST class
        _700_Search_in_a_Binary_Search_Tree searcher = new _700_Search_in_a_Binary_Search_Tree();

        // Testing searchBST method
        TreeNode result = searcher.searchBST(root, 2);

        if (result != null) {
            System.out.println("Node found with value: " + result.val);
        } else {
            System.out.println("Node not found");
        }
    }
}
