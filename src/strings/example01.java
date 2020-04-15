package strings;

import java.util.Arrays;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:strings
 */
public class example01 {
    public static void main(String[] args) {
        String[] a = {"boy","apple","Applet","Apple","girl","Hat"};
        String[] b = Arrays.copyOf(a,a.length);
        Arrays.sort(b);
        for(String s : b)
        {
            System.out.println(" "+s);
        }
        char a1 = 'A';
        char a2 = 'a';
        System.out.println("A"+(int)a1);
        System.out.println("a"+(int)a2);

    }
}
