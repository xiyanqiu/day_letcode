package tree;

/**
 * @Auther:leeling
 * @Date:2020/4/28 Description:tree
 */
public class Day07 {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }


    }

    /**
     *   letcode 面试55-1.二叉树的深度
      * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        //递归 前序遍历
        int maxdepth = 0;
        int len = 0;
        int maxleft,maxright;

        if(root == null)
        {
            return 0;
        }

         maxleft = maxDepth(root.left);
         maxright = maxDepth(root.right);
         maxdepth = maxleft>maxright? maxleft:maxright;

        return maxdepth+1;


        }


    public static void main(String[] args) {
        Day07 day07 = new Day07();
//        3,9,20,null,null,15,7
        TreeNode treeNode01 = new TreeNode(3);
        treeNode01.left = new TreeNode(9);
        treeNode01.right = new TreeNode(20);
//        treeNode01.left.left = new TreeNode(0);
//        treeNode01.left.right = new TreeNode(0);
        treeNode01.right.left = new TreeNode(15);
        treeNode01.right.right = new TreeNode(7);
        int depth = day07.maxDepth(treeNode01);
        System.out.println(depth);

    }


}
