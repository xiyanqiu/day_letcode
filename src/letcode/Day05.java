package letcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Auther:leeling
 * @Date:2020/4/24 Description:letcode
 */
public class Day05 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

     public class TreeNode
     {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }



    /**
     * 面试02.02
     * @param head
     * @param k
     * @return
     */
    public int kthToLast(ListNode head, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        int val = head.val;
        while (head!=null )
        {
            arrayList.add(val);

            head = head.next;
            if(head!=null)
            {
            val = head.val;
            }
            else
                {
                    val = 0;
                }

            count = count + 1;
        }
//        for(int i =0;i<arrayList.size();i++)
//        {
//            System.out.println(arrayList.get(i));
//        }

        return arrayList.get(arrayList.size()-k);

    }


    /**
     * 04.02
     * @param nums
     * @return
    */
    public TreeNode sortedArrayToBST(int[] nums) {
        return retree(nums,0,nums.length);



    }


    /**
     * 面试17
     * @param n
     * @return
     */
    public int[] printNumbers(int n) {
        int[] ret = new int[(int)Math.pow(10,n)-1];
        for(int i = 0;i<ret.length;i++)
        {
            ret[i] = i+1;
        }
        return ret;


    }




    public TreeNode retree(int[] nums,int start,int end)
    {
        if(start==end)
        {
            return null;
        }
        int mid = start + (end-start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = retree(nums, start, mid);
        node.right = retree(nums,mid+1,end);
        return node;
    }


    public static void main(String[] args) {
        Day05 day05 = new Day05();
        ListNode l1 = new ListNode(1);
        l1.next =new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(5);
        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(4);
        l2.next.next= new ListNode(3);
        int ret = day05.kthToLast(l1, 2);
        System.out.println(ret);
        int[] a ={1,2,3,4,5};
        System.out.println(a.length);

    }


}
