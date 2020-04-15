package strategy;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:strategy
 */
public class StrategyA implements Strategy {
    @Override
    public double computerAverage(double[] a) {
        double sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }

        return sum/a.length;
    }
}
