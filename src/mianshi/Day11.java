package mianshi;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Auther:leeling
 * @Date:2020/5/12 Description:mianshi
 */
public class Day11 {


    /**
     * 面试16.07
     * @param a
     * @param b
     * @return
     */
    public int maximum(int a, int b) {
        return Math.max(a,b);
       }


    /**
     * 美团
     * @param a
     * @return
     */
    public int maxnum(int[][] a )
    {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = 0;
        int i =0;
        int temp = -1;

        for(int j = 0; j<a[0].length;j++)
        {
            while (i<a.length){
            max = a[i][j]>max? a[i][j]:max;
            if(a[i][j]==max)
                {
                    temp = i;
                }

            i++;

           }
           if(!arrayList.contains(temp))
           {arrayList.add(temp);}
         i=0;
         max = 0;

        }
        return arrayList.size();

        }


    public static void main(String[] args) {
        Day11 day11 = new Day11();
        int[][] a ={{28,35,38,10,19},{4,76,72,38,86},{96,80,81,17,10}} ;
        int maxnum = day11.maxnum(a);
        System.out.println(maxnum);

    }

    }




