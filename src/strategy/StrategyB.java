package strategy;

import java.util.Arrays;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:strategy
 */
public class StrategyB implements Strategy {
    @Override
    public double computerAverage(double[] a) {
        double sum = 0;
        if(a.length<=2)
        {
            System.out.println("Only two input");
            return 0;
        }
        Arrays.sort(a);
        for(int i =1;i<a.length-1;i++)
        {
            sum = sum + a[i];
        }
        return sum/(a.length-2);
    }
}
