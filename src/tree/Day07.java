package tree;

import listnode.Day08;

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
     *   617.合并二叉树
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode tree;
        if(t1==null&&t2==null)
        {
            return null;
        }
        tree = new TreeNode((t1!=null? t1.val :0 )+ (t2!=null? t2.val:0));
        tree.left = mergeTrees(t1!=null? t1.left:null,t2!=null?t2.left:null);
        tree.right = mergeTrees(t1!=null?t1.right:null,t2!=null?t2.right:null);
        return tree;
    }

    /**
     *   572.另一个树的子树
     * @param s
     * @param t
     * @return
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        //t是不是和s一样
        //t是不是s的左右子树
        //共三种情况
        if(s==null&&t==null)
        {
            return true;
        }
        if(s==null&&t!=null)
        {
            return false;
        }

        return judgetree(s,t)|| isSubtree(s.left,t) || isSubtree(s.right,t);



    }

    private boolean judgetree(TreeNode s, TreeNode t) {
        if(s==null&&t==null)
        {

            return true;
        }
        if(s==null||t==null)
        {
            return false;
        }
        if(s.val!=t.val)
        {
            System.out.println("---------");
            return false;
        }
        return judgetree(s.left,t.left)&&judgetree(s.right,t.right);

    }


    /**
     *    面试题27.二叉树的镜像
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        TreeNode tmp;
        if(root==null)
        {
            return null;

        }
        tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;

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
        TreeNode treeNode01 = new TreeNode(1);
        treeNode01.left = new TreeNode(9);
        treeNode01.right = new TreeNode(20);
//        treeNode01.left.left = new TreeNode(0);
//        treeNode01.left.right = new TreeNode(0);
//        treeNode01.right.left = new TreeNode(15);
//        treeNode01.right.right = new TreeNode(7);
////        int depth = day07.maxDepth(treeNode01);
////        System.out.println(depth);
//        TreeNode treeNode = day07.mirrorTree(treeNode01);
//        TreeNode treeNode01 = new TreeNode(1);
//        treeNode01.right = new TreeNode(1);
//        treeNode01.right.right = new TreeNode(1);
//        treeNode01.right.right.right = new TreeNode(1);
//        treeNode01.right.right.right.right = new TreeNode(1);
//        treeNode01.right.right.right.right.right = new TreeNode(1);
//        treeNode01.right.right.right.right.right.right = new TreeNode(1);
//        treeNode01.right.right.right.right.right.right.right = new TreeNode(1);
//        treeNode01.right.right.right.right.right.right.right.right = new TreeNode(1);
//        treeNode01.right.right.right.right.right.right.right.right.right = new TreeNode(1);
//        treeNode01.right.right.right.right.right.right.right.right.right.right = new TreeNode(1);
//        treeNode01.right.right.right.right.right.right.right.right.right.right.left = new TreeNode(2);
//        TreeNode treeNode02 = new TreeNode(1);
//        treeNode02.right = new TreeNode(1);
//        treeNode02.right.right = new TreeNode(1);
//        treeNode02.right.right.right = new TreeNode(1);
//        treeNode02.right.right.right.right = new TreeNode(1);
//        treeNode02.right.right.right.right.right = new TreeNode(1);
//        treeNode02.right.right.right.right.right.left = new TreeNode(2);
//[1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,2]
//[1,null,1,null,1,null,1,null,1,null,1,2]
//
//        boolean judgetree = day07.judgetree(treeNode01, treeNode02);
//        System.out.println(judgetree);
        TreeNode treeNode02 = new TreeNode(3);
        treeNode02.right = new TreeNode(4);
        treeNode02.right.left = new TreeNode(1);
        TreeNode treeNode = day07.mergeTrees(treeNode01, treeNode02);




    }


}
