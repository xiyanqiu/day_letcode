package tree;

import java.util.*;

/**
 * @Auther:leeling
 * @Date:2020/5/27 Description:tree
 */
public class Day10 {

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
    }

    /**
     * 590. N叉树的后序遍历
     * @param root
     * @return
     */
    public List<Integer> postorder(Node root) {
        //创建一个新的list用来返回结果
        List<Integer> list = new ArrayList<>();
        //创建一个list用来动态改变root
        List<Node> stack = new ArrayList<>();
        //如果root为空，则返回null
        if(root==null)
        {
            return list;
        }
        Node temp = root;
        stack.add(temp);
        while (stack.size()>0)
        {
            temp = stack.remove(stack.size()-1);
            list.add(temp.val);
            for (Node child:temp.children) {
                stack.add(child);
            }
        }
        Collections.reverse(list);
        return list;



    }


}
