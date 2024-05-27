package BinaryTreeDFS;


public class _701_Insert_into_a_Binary_Search_Tree {
    private TreeNode mRoot;

    public TreeNode insert(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = new TreeNode(val);
            return root;
        } else {
            TreeNode temp = root;
            while (true) {
                if (val > temp.val) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }

    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        _701_Insert_into_a_Binary_Search_Tree bst = new _701_Insert_into_a_Binary_Search_Tree();
        bst.mRoot = bst.insert(bst.mRoot, 5);
        bst.mRoot = bst.insert(bst.mRoot, 3);
        bst.mRoot = bst.insert(bst.mRoot, 7);
        bst.mRoot = bst.insert(bst.mRoot, 2);
        bst.mRoot = bst.insert(bst.mRoot, 4);
        bst.mRoot = bst.insert(bst.mRoot, 6);
        bst.mRoot = bst.insert(bst.mRoot, 8);

        System.out.println("In-order traversal of the BST:");
        bst.inOrderTraversal(bst.mRoot);  // Expected output: 2 3 4 5 6 7 8
    }
}
