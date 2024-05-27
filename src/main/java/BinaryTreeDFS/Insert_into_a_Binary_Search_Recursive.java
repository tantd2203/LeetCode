package BinaryTreeDFS;

public class Insert_into_a_Binary_Search_Recursive {

    // Recursive insertion method
    public static TreeNode insertBinarySearchRecursive(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.val) {
            root.left = insertBinarySearchRecursive(root.left, value);
        } else {
            root.right = insertBinarySearchRecursive(root.right, value);
        }
        return root;
    }

    // Method for in-order traversal
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Insert_into_a_Binary_Search_Recursive bst = new Insert_into_a_Binary_Search_Recursive();
        TreeNode root = null;
        root = insertBinarySearchRecursive(root, 5);
        root = insertBinarySearchRecursive(root, 3);
        root = insertBinarySearchRecursive(root, 7);
        root = insertBinarySearchRecursive(root, 2);
        root = insertBinarySearchRecursive(root, 4);
        root = insertBinarySearchRecursive(root, 6);
        root = insertBinarySearchRecursive(root, 8);

        System.out.println("In-order traversal of the BST:");
        bst.inOrderTraversal(root);  // Expected output: 2 3 4 5 6 7 8
    }
}