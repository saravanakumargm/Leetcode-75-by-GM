public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return root;
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                TreeNode curr = root.left;
                while (curr.right != null) {
                    curr = curr.right;
                }
                root.val = curr.val;
                root.left = deleteNode(root.left, curr.val);
            }
        }
        return root;
    }
}
