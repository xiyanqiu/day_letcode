package strings;

import java.util.StringTokenizer;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:strings
 */
public class example02 {
    public static void main(String[] args) {
        String s = "We are stu,dent";
        StringTokenizer fenxi = new StringTokenizer(s," ,");
        int num = fenxi.countTokens();
        while (fenxi.hasMoreTokens())
        {
            String si = fenxi.nextToken();
            System.out.println(si);
            System.out.println("还剩"+fenxi.countTokens()+"个单词");
        }
        System.out.println("共有"+num+"个单词");
    }
}
