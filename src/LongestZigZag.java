public class LongestZigZag {
    public int longestZigZag(TreeNode root) {
        return longest(root,0);
    }
    private int longest(TreeNode root,int direction){
        if(root==null){
            return 0;
        }
        int max = 0;
        int leftCount = 0;
        boolean isLeft = true;
        TreeNode current = root.left;
        while(current!=null){
            leftCount++;
            if(isLeft){
                max=Math.max(longest(current.left,2),max);
                current = current.right;
            }else{
                max=Math.max(longest(current.left,1),max);
                current = current.right;
            }
            isLeft = !isLeft;
        }
        isLeft = false;
        int rightCount = 0;
        current = root.left;
        while(current!=null){
            rightCount++;
            if(isLeft){
                max=Math.max(longest(current.left,2),max);
                current = current.right;
            }else{
                max=Math.max(longest(current.left,1),max);
                current = current.right;
            }
        }
        if(direction==1){
            leftCount++;
        }else{
            rightCount++;
        }
        return Math.max(Math.max(rightCount,leftCount),max);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(7);
        node.right.right = new TreeNode(4);
        System.out.println(new LongestZigZag().longestZigZag(node));
    }
}
