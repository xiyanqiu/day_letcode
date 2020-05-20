package listnode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther:leeling
 * @Date:2020/5/1 Description:listnode
 */
public class Day08 {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
        }

    public ListNode reverseList(ListNode head) {
        //使用栈来解决问题
//        if(head == null){
//            return head;
//        }
//
//        ListNode listNode = null ;
//        Stack<Integer> stack = new Stack<>();
//        while (head!=null)
//        {
//            stack.push(head.val);
//            head = head.next;
//        }
//        ListNode ret = new ListNode(stack.pop());
//        head = ret;
//        while (!stack.isEmpty())
//        {
//
//            head.next = new ListNode(stack.peek());
//
//            stack.pop();
//            head = head.next;
//
//        }
//        head.next =null;
//
//
//        return ret;
        //双指针迭代
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode pre = null;
        ListNode curr = head;
        ListNode temp = null;
        while (curr!=null)
        {
            //记录当前节点的下一个节点
            temp = curr.next;
            //然后将当前节点指向pre
            curr.next = pre;
            //pre和cur节点都前进一位
            pre = curr;
            curr = temp;


        }
        return pre;


    }


    /**
     *   面试题06. 从尾到头打印链表
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        if(head==null)
        {
            return null;
        }
        while (head!=null)
        {
            arrayList.add(head.val);
            head = head.next;
        }
        int[] a = new int[arrayList.size()];
        for(int j=0;j<arrayList.size();j++)
        {
            a[j] = arrayList.get(arrayList.size()-1-j);
        }
        return a;



    }

    /**
     *     21合并两个有序链表
      * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode =new ListNode(0);
        int l1len = 0;
        int l2len = 0;
        int a,b;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (l1!=null)
        {
            arrayList.add(l1.val);
            l1len +=1;
            l1 = l1.next;

        }
        while (l2!=null)
        {
            arrayList.add(l2.val);
            l2len +=1;
            l2 = l2.next;

        }
        if(arrayList.size()<=0)
        {
            return null;
        }

        else
            {
                arrayList.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
                });
                for(int i=0;i<arrayList.size();i++)
                {

                    listNode.next = new ListNode(arrayList.get(i));
                    listNode = listNode.next;
                }
            }
//        while (l1!=null||l2!=null)
//        {
//            if(l1!=null&&l2!=null){
//            a = l1.val>=l2.val? l1.val:l2.val;
//            listNode.next = new ListNode(a);
//            b = l1.val<l2.val? l1.val:l2.val;
//            listNode.next.next = new ListNode(b);
//            }
//            else
//                {
//                    if(l1==null&&l2!=null)
//                    {
//                        listNode.next = new ListNode(l2.val);
//
//                    }
//                    if(l1!=null&&l2==null)
//                    {
//                        listNode.next = new ListNode(l1.val);
//
//                    }
////                    if(l1==null&&l2==null)
////                    {
////                        return listNode.next;
////                    }
//                }
//
//        }
        return listNode.next;

    }


    public static void main(String[] args) {
        Day08 day08 =  new Day08();
        ListNode l1 = new ListNode(1);
        l1.next =new ListNode(2);
        l1.next.next = new ListNode(3);
//        l1.next.next.next = new ListNode(4);
//        ListNode l2 = new ListNode(2);
//        l2.next = new ListNode(4);
//        l2.next.next= new ListNode(5);
//        ListNode l3 = new ListNode(0);
//        ListNode listNode = day08.mergeTwoLists(l1, l2);
//        while (listNode!=null)
//        {
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
    
        int[] printe = day08.reversePrint(l1);
        for(int i=0;i< printe.length;i++)
        {
            System.out.println(printe[i]);
        }

    }













}
