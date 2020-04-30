package letcode;

import java.util.Arrays;

/**
 * @Auther:leeling
 * @Date:2020/4/30 Description:letcode
 */
public class Day06 {


    /**
     *   1351.统计有序矩阵中的负数
     * @param grid
     * @return
     */
    public int countNegatives(int[][] grid) {
        int count =0;
        int rows = grid.length;
        int cows = grid[0].length;

        for(int i = 0;i<rows;i++) {

                Arrays.sort(grid[i]);
                int start = 0;
                int end = cows-1;
                while (start<=end){
                int mid = (end-start)/2+start;
                if (grid[i][mid] < 0) {
                    count = mid-start+1 +count;
                    start = mid+1;
                    }
                if(grid[i][mid]>=0){
                    end = mid-1;
                }


                }

        }

        return count;
    }


    public static void main(String[] args) {
//        int[][] a =  {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][] a = {{1,-1},{-1,-1}};
        Day06 day06 = new Day06();
        int i = day06.countNegatives(a);
        System.out.println(i);


    }


}
