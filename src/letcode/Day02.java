package letcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther:leeling
 * @Date:2020/4/16 Description:letcode
 */
public class Day02 {

//    public String addStrings(String num1, String num2) {
//        char[] nums1 = num1.toCharArray();
//        char[] nums2 = num2.toCharArray();
//        int len = nums1.length > nums2.length ? nums1.length : nums2.length;
//        for(int i =0;i<len;i++)
//        {
//
//        }
//
//
//    }
    //按位翻转字符串
    public String reverseLeftWords(String s, int n) {
        //如果指定的位数为负或0
        if(n<=0)
        {
            return s;
        }
        //如果指定的位数大于字符串长度
        if(n>=s.length())
        {
            StringBuffer stringBuffer = new StringBuffer(s);
            return String.valueOf(stringBuffer.reverse());
        }
        else
            {
                String s1 = s.substring(n);
                String s2 = s.substring(0,n);
                return s1 +s2;
            }

    }

    /**
     *     返回步数
     * @param num
     * @return
     */
    public int numberOfSteps (int num) {
        int count = 0;
        while (num>0){
        //num为偶数
        if(num%2==0)
        {
            num = num/2;
        }
        //num为奇数
        else
            {
                num = num-1;
            }
        count = count +1;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i =0;i<nums.length;i++)
        {
            String number = String.valueOf(nums[i]);
            if (number.length()%2 ==0 )
            {
                count = count +1;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        Day02 day02 = new Day02();
//        int[] nums = {5555,901,482,1771};
//        int re = day02.findNumbers(nums);
//        System.out.println(re);
//        int num = 123;
//        int ret = day02.numberOfSteps(num);
//        System.out.println(ret);
        String s = "abcdefg";
        int n = 2;
        String ret = day02.reverseLeftWords(s, n);
        System.out.println(ret);



    }

}
