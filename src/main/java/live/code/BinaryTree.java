package live.code;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BinaryTree {
    public boolean isValidBinaryTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isValidBinaryTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBinaryTree(TreeNode node, int minVal, int maxVal) {
        if (node == null) {
            return true;
        }
        if (node.val <= minVal || node.val >= maxVal) {
            return false;
        }
        return isValidBinaryTree(node.left, minVal, node.val) && isValidBinaryTree(node.right, node.val, maxVal);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        System.out.println(tree.isValidBinaryTree(root));  // Output: true
    }
}
