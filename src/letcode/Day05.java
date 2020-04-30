package letcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

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
     *     1221.分割平衡字符串,解法**重要
     * @param s
     * @return
     */
    public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(stack.isEmpty()||c==stack.peek())
            {
                stack.push(c);
            }
            else
                {
                    stack.pop();
                }
            if(stack.isEmpty())
            {
                count ++;
            }
        }
        return count;

    }



    /**
     *  202,快乐数
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        while (n!=1)
        {
            int sum =0;
            while (n>0)
            {
                int temp = n%10;
                sum += Math.pow(temp,2);
                n = n/10;
            }
            System.out.println(sum);
            n = sum;
            if(hashMap.size()>100)
            {
                return false;
            }
            if(hashMap.containsKey(sum))
            {
                hashMap.put(sum,0);
                return false;
            }
        }
        hashMap.put(n,1);

      return true;

    }



    //超出时间
//    public boolean isHappy(int n) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(n);
//        while (n!=1){
//
//
//        String s = String.valueOf(n);
//        int sum =0;
//        for(int i =0;i<s.length();i++)
//        {
//             char c = s.charAt(i);
//             int each = Integer.parseInt(String.valueOf(c));
//             sum = (int) (sum + Math.pow(each,2));
//        }
//         for(int k=0;k<arrayList.size();k++)
//        {
//
//            if(sum==arrayList.get(k))
//            {
//                return false;
//            }
//        }
//        n = sum;
//
//        }
//        return true;
//
//    }


    /**
     *    LCP 06.拿硬币
      * @param coins
     * @return
     */
    public int minCount(int[] coins) {
        int sum = 0;
        if(coins.length<=0)
        {
            return 0;
        }
        for(int i =0;i<coins.length;i++)
        {
            if(coins[i]/2 >0){

                if(coins[i]%2==0)
                {
                    sum = sum + coins[i]/2;
                }
                else
                    {
                        sum = sum + coins[i]/2 +1;
                    }
            }
            else
                {
                    if(coins[i]==0)
                    {
                        sum = sum;
                    }
                    if(coins[i]==1)
                    {
                        sum = sum +1;
                    }
                }
        }
        return sum;

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
//        ListNode l1 = new ListNode(1);
//        l1.next =new ListNode(2);
//        l1.next.next = new ListNode(4);
//        l1.next.next.next = new ListNode(5);
//        ListNode l2 = new ListNode(6);
//        l2.next = new ListNode(4);
//        l2.next.next= new ListNode(3);
//        int ret = day05.kthToLast(l1, 2);
//        System.out.println(ret);
//        int[] a ={1,2,3,4,5};
//        System.out.println(a.length);
//        int[] a ={2,3,10};
//        int minCount = day05.minCount(a);
//        System.out.println(minCount);
//        int a = 19;
//        boolean happy = day05.isHappy(a);
//        System.out.println(happy);
//        System.out.println(1%10);
        String s = "RLLLLRRRLR";
        int stringSplit = day05.balancedStringSplit(s);
        System.out.println(stringSplit);


    }


}
