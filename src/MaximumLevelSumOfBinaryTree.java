import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfBinaryTree {
    public int maxLevelSum(TreeNode root) {
        int maxi = Integer.MIN_VALUE;
        int maxLevel=1;
        int currLevel=1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int n = q.size();
            int sum=0;
            for(int i =0;i<n;i++){
                TreeNode node = q.remove();
                sum+=node.val;
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            if(sum>maxi){
                maxi=sum;
                maxLevel=currLevel;
            }
            currLevel++;
        }
        return maxLevel;
    }
}
