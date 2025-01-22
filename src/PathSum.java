public class PathSum {
    int count = 0;
    public int pathSum(TreeNode root, int targetSum){
        if(root==null)
            return 0;
        return pathSum(root.right,targetSum) + pathSum(root.left,targetSum) + findSum(root,targetSum,0);
    }

    private int findSum(TreeNode root, int targetSum, int curSum) {
        if(root==null)
            return 0 ;
        curSum+=root.val;
        return (curSum==targetSum ? 1 : 0 ) + findSum(root.right, targetSum, curSum) + findSum(root.left, targetSum, curSum);
    }
}


/*
n = 5
1
3 2
4 5 6
7 7
9

n = 7
1
3 2
4 5 6
7 8 9 10
13 12 11
14 15
16
 */

