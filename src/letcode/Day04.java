package letcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Auther:leeling
 * @Date:2020/4/21 Description:letcode
 */
public class Day04 {


    /**
     * 面试08.11
     * @param n
     * @return
     */
    public int waysToChange(int n) {
        int sum =0;
        int a = n/25;
        int b = n/10;
        int c = n/5;
        int d = n/1;
        int a1,b1,c1,d1;
        for(a1=0;a1<=a;a1++)
        {
            for(b1=0;b1<=b;b1++)
            {
                for(c1=0;c1<=c;c1++)
                {
                    d1 = n-a1*25-b1*10-c1*5;
                    if (d1>=0)
                    {
                        System.out.println("result="+a1+" "+b1+" " +c1+" "+d1);
                        sum = sum +1;
                    }



//                    for(d1=0;d1<=d;d1++)
//                    {
//                        d1 = n-a1*25+b1*10+c1*5;
//                        if(a1*25+b1*10+c1*5+d1*1==n)
//                        {
////                            System.out.println("result="+a1+" "+b1+" " +c1+" "+d1);
//                            sum = sum+1;
//                        }
//
//                    }
                }

            }

        }
        return sum;

    }







    /**
     * 1290
     * @param head
     * @return
     */

    public int getDecimalValue(ListNode head) {
        int len =0;
        int val = head.val;
        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head!=null)
        {

            val = head.val;
            arrayList.add(val);
            head = head.next;



        }
        for(int i = 0;i<arrayList.size();i++)
        {
//            System.out.println("list.size"+arrayList.size());
//            System.out.println("list"+arrayList.get(i));
            if(arrayList.get(i)==1)
            {
                sum = (int)Math.pow(2,arrayList.size()-i-1)+sum;
            }
        }
        return sum;


    }


      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    /**
     * 237
     * @param node
     */

    public void deleteNode1(ListNode node) {
        if(node.next == null)
        {

            node = null;
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }



    /**
     * 面试02.03
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }


    /**
     * 1266
     * @param points
     * @return
     */
    public int minTimeToVisitAllPoints(int[][] points) {
        int len = points.length;
        int xy = points[0].length;
        int sum =0;
        int max = 0;
        if (len <=1)
        {
            return 0;
        }
        else {
        for(int i = 0;i<len-1;i++)
        {
            int bijiao = i+1;

              max = Math.max(Math.abs(points[bijiao][0]-points[i][0]),Math.abs(points[bijiao][1]-points[i][1]));


            sum = sum + max;


        }
        return sum;

    }
    }


    public static void main(String[] args) {
        Day04 day04 = new Day04();

//        int[][] points = {{3,2},{-2,2}};
//        int ret = day04.minTimeToVisitAllPoints(points);
//        System.out.println(ret);
//        ListNode l1 = new ListNode(1);
//        l1.next =new ListNode(0);
//        l1.next.next = new ListNode(1);
//        ListNode l2 = new ListNode(6);
//        l2.next = new ListNode(4);
//        l2.next.next= new ListNode(3);
//        ListNode l3 = new ListNode(0);
//        int value = day04.getDecimalValue(l3);
//        System.out.println(value);
        int ret = day04.waysToChange(10);
        System.out.println(ret);



    }


}
