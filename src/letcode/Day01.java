package letcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther:leeling
 * @Date:2020/4/2 Description:letcode
 */
public class Day01 {
    public int minaround(int a,int b,int c,int d) {
        return Math.min(a,b)<Math.min(c,d)? Math.min(a,b):Math.min(c,d);
    }

    public int[][] updateMatrix(int[][] matrix) {
        //行数
        int rows = matrix.length;
        int cows = matrix[0].length;
        int array_int[][] = new int[rows][cows];

        for(int i = 0;i<rows;i++)
        {
            int up = i-1>0 ? i-1:0;
            int down = i+1<cows-1 ? i+1:cows-1;
            int k = i;
            for(int j = 0;j<cows;j++)
            {
                int left = j-1>0 ? j-1:0;
                int right = j+1<cows-1 ? j+1:cows-1;
                int t = j;
                //如果a【i】【j】==0
                if(matrix[i][j] == 0)
                {
                    array_int[k][t] = 0;
                }
                //如果a【i】【j】==1
                else
                    {
                        //a【i】【j】为1但是周围有0
                        if (matrix[up][j]==0||matrix[down][j]==0||matrix[i][left]==0||matrix[i][right]==0)
                        {
                            array_int[k][t] = 1;
                        }
                        else {
                            int n1 = matrix[up][j];
                            int n2 = matrix[down][j];
                            int n3 = matrix[i][left];
                            int n4 = matrix[i][right];
                            int min = minaround(n1, n2, n3, n4) +1;
                            array_int[k][t] = min+1;
                        }
                    }
            }
        }
        return array_int;




        }
    public String toLowerCase(String str) {
        String result = str.toLowerCase();
        return result;


    }
    public int maximum69Number (int num) {
        int flag = 0 ;
        String s = String.format(String.valueOf(num));
        String result = s.replaceFirst("6", "9");
        return Integer.parseInt(result);
    }
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for(int i =0;i<guess.length;i++)
        {
            if (guess[i] == answer[i])
            {
                count = count + 1;
            }
        }
        return count;

    }

    public int lengthOfLastWord(String s) {
        String[] st = s.split(" ");
        if(st.length<1)
        {
            return 0;
        }
        String anwser = st[st.length-1];
        return anwser.length();

    }


    public static void main(String[] args) {
        Day01 day01 = new Day01();
//        while (true){
//        System.out.println("please input a string:");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        int len = day01.lengthOfLastWord(s);
//        System.out.println(len);}

        //2
//        int a[] ={2,2,3};
//        int b[] = {3,2,1};
//        int game = day01.game(a, b);
//        System.out.println(game);

        //3
//        while (true)
//        {
////            System.out.println("please input a num:");
////            Scanner scanner = new Scanner(System.in);
////            int s = scanner.nextInt();
////            int retu = day01.maximum69Number(s);
////            System.out.println(retu);
//            System.out.println("please input a string:");
//            Scanner scanner = new Scanner(System.in);
//            String s = scanner.nextLine();
//            String retu = day01.toLowerCase(s);
//            System.out.println(retu);
//
//        }
        Scanner sc = new Scanner(System.in) ;
        System.out.print("请输入矩阵的行高：");
        int a = sc.nextInt() ;
        System.out.print("请输入矩阵的列宽：");
        int b = sc.nextInt() ;
        int[][] x = new int[a][b] ;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("请输入元素x["+i+"]["+j+"]的值：" );
                x[i][j] = sc.nextInt() ;
                    }
                     }
        int[][] updateMatrix = day01.updateMatrix(x);
        for(int i = 0;i<updateMatrix.length;i++)
        {
           for(int j = 0 ;j<updateMatrix[0].length;j++)
           {
               System.out.print(updateMatrix[i][i]+"  ");
           }
           System.out.println();
        }
    }



    }
