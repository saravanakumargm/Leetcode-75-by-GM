import javax.swing.plaf.IconUIResource;

public class CountGoodNodes {
    int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        getGoods(root,Integer.MIN_VALUE);
        return count;
    }

    private void getGoods(TreeNode root, int minValue) {
        if(root == null){
            return;
        }
        if(root.val>minValue){
            count++;
        }
        minValue = Math.max(minValue,root.val);
        getGoods(root.left,minValue);
        getGoods(root.right,minValue);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(4);
        System.out.println(new CountGoodNodes().goodNodes(node));
    }
}
