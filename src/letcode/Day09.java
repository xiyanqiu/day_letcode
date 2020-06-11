package letcode;

import java.util.*;

/**
 * @Auther:leeling
 * @Date:2020/5/21 Description:letcode
 */
public class Day09 {


//    /**
//     *  1051. 高度检查器
//     * @param heights
//     * @return
//     */
//    public int heightChecker(int[] heights) {
//        int[] obj = heights.clone();
//        Arrays.sort(obj);
//        int count = 0;
//        for(int i = 0;i<heights.length-1;i++)
//        {
//            if(heights[i]!=obj[i])
//
//            {
//                System.out.println("11111");
//                int temp = heights[i];
//                for(int j = i+1;j<heights.length;j++)
//                {
//                    if(heights[j]==obj[i])
//                    {
//                        System.out.println(temp);
//                        heights[i] = obj[i];
//                        heights[j] = temp;
//                        count++;
//                        break;
//                    }
//                }
//            }
//        }
//        return count;
//
//
//    }


    /**
     * 728.自除数
     * @param left
     * @param right
     * @return
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = left;i<=right;i++)
        {
            String s = Integer.toString(i);
            char[] array = s.toCharArray();
            int j =0;
            for (j=0;j<array.length;j++)
            {
                int eve =  Integer.parseInt(String.valueOf(array[j])) ;
                System.out.println(eve);
                if(eve==0)
                {
                    break;
                }
                if(i%eve!=0)
                {
                    break;
                }


            }
            if(j==array.length)
            {
                list.add(i);
            }
        }
        return list;

    }

    /**
     * 287. 寻找重复数
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        /**
         快慢指针思想, fast 和 slow 是指针, nums[slow] 表示取指针对应的元素
         注意 nums 数组中的数字都是在 1 到 n 之间的(在数组中进行游走不会越界),
         因为有重复数字的出现, 所以这个游走必然是成环的, 环的入口就是重复的元素,
         即按照寻找链表环入口的思路来做
         **/
//        int fast = 0, slow = 0;
//        while(true) {
//            fast = nums[nums[fast]];
//            slow = nums[slow];
//            if(slow == fast) {
//                fast = 0;
//                while(nums[slow] != nums[fast]) {
//                    fast = nums[fast];
//                    slow = nums[slow];
//                }
//                return nums[slow];
//            }
//        }
//        '''2、小于O(n^2) 二分查找
//        我们不要考虑数组,只需要考虑 数字都在 1 到 n 之间
//        示例 1:
//        arr = [1,3,4,2,2] 此时数字在 1 — 5 之间
//
//                mid = (1 + 5) / 2 = 3 arr小于等于的3有4个(1,2,2,3)，1到3中肯定有重复的值
//                mid = (1 + 3) / 2 = 2 arr小于等于的2有3个(1,2,2)，1到2中肯定有重复的值
//                mid = (1 + 2) / 2 = 1 arr小于等于的1有1个(1)，2到2中肯定有重复的值
//        所以重复的数是 2
//
        int left = 1;
        int right = nums.length;
        while(left < right) {
            int mid = (int)(left + (right - left) / 2);
            int cnt = 0;
            for (int i = 0;i<nums.length;i++) {
                if(nums[i]<=mid)
                {
                    cnt++;
                }}
                if(cnt<=mid)
                {
                    left = mid+1;
                }
                else
                    {
                        right = mid;
                    }

        }
        return right;
    }

    /**
     *  面试题15. 二进制中1的个数
     * @param n
     * @return
     */
    public int hammingWeight(int n) {

        String binaryString = Integer.toBinaryString(n);
        int[] binary = new int[binaryString.length()];
        char[] charArray = binaryString.toCharArray();
        Arrays.sort(charArray);
        int k =0;
        if(n==0)
        {
            return 0;
        }
        for(int i = 0;i<charArray.length;i++)
        {
            if(charArray[i]=='1')
            {
                k = i;
                break;
            }
        }
        return charArray.length-k;

    }


    /**
     *   1370.上升下降字符串
     * @param s
     * @return
     */
    public String sortString(String s) {
        int[] map = new int[26];
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++)
        {

            map[s.charAt(i)-97] += 1;
        }
        for(int i=0;i<map.length;i++) {
            while (map[i]!=0)  //只要有位置上不为0
            {
            for (int j = 0; j < map.length; j++)   //正向添加
            {
                if (map[j] != 0) {
                    sb.append((char) (j + 97));
                    map[j]--;
                }

            }
            for (int k = map.length - 1; k >= 0; k--) //反向添加
            {
                if(map[k] != 0){
                sb.append((char)( k + 97));
                map[k]--;
            }}

        }}
        return sb.toString();
    }
    /**
     *  657. 机器人能否返回原点
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
//        Stack<Character> stack = new Stack();
//        for(int i =0;i<moves.length();i++)
//        {
//            if(stack.isEmpty())
//            {
//                stack.push(moves.charAt(i));
//
//            }
//
//            else {
//                if (moves.charAt(i) == 'U' && stack.peek() == 'D' || moves.charAt(i) == 'D' && stack.peek() == 'U' ||
//                        moves.charAt(i) == 'L' && stack.peek() == 'R' || moves.charAt(i) == 'R' && stack.peek() == 'L') {
//                    System.out.println("11111111111");
//                    System.out.println(stack.peek());
//                    System.out.println(moves.charAt(i));
//                    System.out.println("00000000000");
//
//                    stack.pop();
//                } else {
//                    System.out.println("push");
//                    System.out.println(moves.charAt(i));
//                    System.out.println("push");
//                    stack.push(moves.charAt(i));
//                }
//            }
//        }
//        System.out.println(stack.peek());
//        if(!stack.isEmpty())
//
//        {
//            System.out.println(stack.peek());
//            stack.pop();
//        }
//        return stack.isEmpty();


        int rows = 0;
        int cows = 0;
        for(int i =0;i<moves.length();i++)
        {
            char c = moves.charAt(i);
            if(c=='U')
            {
             rows++;
            }
            if(c=='D')
            {
                rows--;
            }
            if(c=='L')
            {
                cows++;
            }
            if(c=='R')
            {
                cows--;
            }

        }
        return rows==0&&cows==0;
    }


    /**
     *  1309. 解码字母到整数映射
     * @param s
     * @return
     */
//
//    给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
//
//    字符（'a' - 'i'）分别用（'1' - '9'）表示。
//    字符（'j' - 'z'）分别用（'10#' - '26#'）表示。
    public String freqAlphabets(String s) {
//        HashMap<String,Character> hashMap  =new HashMap<>();
//
//        hashMap.put("1",'a');
//        hashMap.put("2",'b');
//        hashMap.put("3",'c');
//        hashMap.put("4",'d');
//        hashMap.put("5",'e');
//        hashMap.put("6",'f');
//        hashMap.put("7",'g');
//        hashMap.put("8",'h');
//        hashMap.put("9",'i');
//        hashMap.put("10#",'j');
//        hashMap.put("11#",'k');
//        hashMap.put("12#",'l');
//        hashMap.put("13#",'m');
//        hashMap.put("14#",'n');
//        hashMap.put("15#",'o');
//        hashMap.put("16#",'p');
//        hashMap.put("17#",'q');
//        hashMap.put("18#",'r');
//        hashMap.put("19#",'s');
//        hashMap.put("20#",'t');
//        hashMap.put("21#",'u');
//        hashMap.put("22#",'v');
//        hashMap.put("23#",'w');
//        hashMap.put("24#",'x');
//        hashMap.put("25#",'y');
//        hashMap.put("26#",'z');
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sb1 = new StringBuilder();
//        for(int i = 0;i<s.length();i++)
//        {
//            char eve = s.charAt(i);
//            if(s.charAt(i)=='#')
//            {
//                System.out.println(sb.toString());
//                System.out.println(sb.length());
//                sb.delete(sb.length()-2,sb.length());
//                sb1.append(s.charAt(i-2));
//                sb1.append(s.charAt(i-1));
//                sb1.append(s.charAt(i));
//                System.out.println(sb1.toString());
//                Character character = hashMap.get(sb1.toString());
//                sb1.delete(0,sb.length());
//                sb.append(character);
//            }
//            sb.append(hashMap.get(String.valueOf(eve)));
////            System.out.println(hashMap.get(String.valueOf(eve)));
//
//
//
//        }
//        return sb.toString();



        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '#') {
                builder.append((char) (chars[--i] - 48 + (chars[--i] - 48) * 10 + 96));
            } else {
                builder.append((char) (chars[i] + 48));
            }
        }

        return builder.reverse().toString();
    }




    /**
     * 832.翻转图片
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] rows = new int[A.length][A[0].length];
        for(int i =0;i<A.length;i++)
        {
            int t = 0;
            for(int j=A[0].length-1;j>=0;j--)
            {
                rows[i][t] = A[i][j]==1?0:1;
                t++;
            }
        }
        return rows;


    }

    /**
     *  1304.和为0的N个唯一整数
     * @param n
     * @return
     */
    public int[] sumZero(int n) {
        int[] ret = new int[n];

        if(n<=1)
        {
            return new int[]{0};

        }
        int i = 1;
        int j = -1;

        if(n%2==0)  //偶数
        {


            int count = n/2;
            int k;
            for(k=0;k<n/2;k++)
            {
                ret[k] = -count;
                count--;

            }
            count = n/2;
            for(int t=k;t<n;t++) {
                ret[t] = count;
                count--;

            }

        }
        if(n%2!=0) //奇数
        {
            int count = n/2;
            int k;
            int t;
            for(k=0;k<n/2;k++)
            {
                ret[k] = -count;
                count--;

            }
            count = n/2;
            for(t=k;t<n-1;t++) {
                ret[t] = count;
                count--;

            }
            ret[t] =0;

        }

        return  ret;

    }


    public static void main(String[] args) {
        Day09 day09 = new Day09();
//        int[] sumZero = day09.sumZero(9);
//        for(int i=0;i<sumZero.length;i++)
//        {
//            System.out.println(sumZero[i]);
//        }
//        int[][] b = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
//        int[][] a = {{1,1,0},{1,0,1},{0,0,0}};
//        int[][] ints = day09.flipAndInvertImage(b);
//        for(int i = 0;i<ints.length;i++)
//        {
//            for(int j = 0;j<ints[0].length;j++)
//            {
//                System.out.print(ints[i][j]+"  ");
//            }
//            System.out.println();
//        }
//        String s = "10#11#12";
//        String alphabets = day09.freqAlphabets(s);
//        System.out.println(alphabets);
//        Character a ='0';
//        System.out.println((int)a);
//        String moves = "RLUURDDDLU";
//        boolean judgeCircle = day09.judgeCircle(moves);
//        System.out.println(judgeCircle);
//        char a ='a';
//        System.out.println((int)a);
//        String s = "spo";
//        String sortString = day09.sortString(s);
//        System.out.println(sortString);
//        int weight = day09.hammingWeight(9);
//        System.out.println(weight);
//        int[] heights = {1,1,4,2,1,3};
//        int checker = day09.heightChecker(heights);
//        System.out.println(checker);
        List<Integer> list = day09.selfDividingNumbers(1, 22);
        for(int i =0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

    }
}
