package letcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Auther:leeling
 * @Date:2020/4/18 Description:letcode
 */
public class Day03 {
    /**
     *  1108
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }



    /**
     * 1389
     * @param nums
     * @param index
     * @return
     */

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ret = new int[nums.length];
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<index.length;i++)
        {

            list.add(index[i],nums[i]);

        }
        for(int j =0;j<ret.length;j++){
            ret[j] = list.get(j);
        }
        return ret;

    }




    /***
     *  1313
     * @param nums
     * @return
     */

    public int[] decompressRLElist(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int count = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(i%2==0){
                count = nums[i];
            }
            else
                {
                    for(int j=0;j<count;j++)
                    {
                        list.add(nums[i]);
                    }

                }
        }
        int[] ret = new int[list.size()];
        for(int k =0;k<list.size();k++)
        {
            ret[k] = list.get(k);
        }

        return ret;

    }


    /**
     * 有多少小于当前数字的数字
     * @param nums
     * @return
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer>  map = new HashMap();
        int[] ret = new int[nums.length];
        int[] numscopy = nums.clone();
        Arrays.sort(numscopy);
        for(int i = 0;i<numscopy.length;i++)
        {
            if (!map.containsKey(numscopy[i]))
            {
            map.put(numscopy[i],i);}
        }
        for(int j = 0;j<nums.length;j++)
        {
            ret[j] = map.get(nums[j]);
        }
        return ret;

    }

    public static void main(String[] args) {
        Day03 day03 = new Day03();
//        int[] nums = {1,1,2,3};
////        int[] ret = day03.smallerNumbersThanCurrent(nums);
//        int[] decompressRLElist = day03.decompressRLElist(nums);
//        for(int k = 0;k<decompressRLElist.length;k++)
//        {
//            System.out.print(decompressRLElist[k]);
//        }

//        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
//        int[] array = day03.createTargetArray(nums, index);
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.print(array[i]);
//        }

        String address = "255.100.50.0";
        String s = day03.defangIPaddr(address);
        System.out.println(s);


    }


}
