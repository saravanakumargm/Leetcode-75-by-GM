import java.util.ArrayList;
import java.util.List;

public class LeftSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> valuesOne = new ArrayList<>();
        List<Integer> valuesTwo = new ArrayList<>();
        getLeafValues(root1, valuesOne);
        getLeafValues(root2, valuesTwo);
        return valuesOne.equals(valuesTwo);
    }
    private void getLeafValues(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        if(root.left == null && root.right==null){
            list.add(root.val);
            System.out.print(root.val + " ");
        }
        getLeafValues(root.left,list);
        getLeafValues(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(4);

        TreeNode node2= new TreeNode(1);
        node2.left = new TreeNode(2);
        node2.right = new TreeNode(3);
        node2.right.right = new TreeNode(4);

        System.out.println(new LeftSimilarTrees().leafSimilar(node,node2));
    }
}
