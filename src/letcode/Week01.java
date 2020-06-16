package letcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @Auther:leeling
 * @Date:2020/6/12 Description:letcode
 */
public class Week01 {





    /**  面试题 01.01. 判定字符是否唯一
     *
     * @param astr
     * @return
     */
    public boolean isUnique(String astr) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        boolean flag = true;
        for(int i = 0;i<astr.length();i++)

        {
            if(!hashMap.containsKey(astr.charAt(i)))
            {
                hashMap.put(astr.charAt(i),1);
            }
            else
                {
                    flag = false;
                    break;
                }

        }
        return flag;

    }

    /**
     *  557. 反转字符串中的单词 III
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        StringBuilder ret = new StringBuilder();
        String[] split = s.split(" ");
        for (String si:split) {
            StringBuilder sb = new StringBuilder();
            ret.append(sb.append(si).reverse().toString()) ;
            ret.append(" ");
            sb.delete(0,sb.length());
        }
        return ret.toString().trim();
    }



    /**
     *   1051.高度检查器
     * @param heights
     * @return
     */
    public int heightChecker(int[] heights) {
        int[] stand = heights.clone();
        Arrays.sort(stand);
        int count = 0;
        for(int i = 0;i<heights.length;i++)
        {
            if(heights[i]!=stand[i])
            {
                count ++;
            }
        }

        return count;

    }
    public static void main(String[] args) {
        Week01 week01 = new Week01();
//        int[] heights = {1,1,4,2,1,3};
//        int checker = week01.heightChecker(heights);
//        System.out.println(checker);
//        String s = "Let's take LeetCode contest";
//        String reverseWords = week01.reverseWords(s);
//        System.out.println(reverseWords);
        String s1 = "leetcode";
        boolean unique = week01.isUnique(s1);
        System.out.println(unique);


    }
}
