import java.util.ArrayList;
import java.util.List;

public class TreeRightSideView {
    List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightRoot(root,0);
        return res;
    }
    public void rightRoot(TreeNode root,int depth){
        if(root==null)return;
        if(depth==res.size()){
            res.add(root.val);
        }
        rightRoot(root.right,depth+1);
        rightRoot(root.left,depth+1);
    }

}
