package strategy;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:strategy
 */
public class Application {
    public static void main(String[] args) {
        AverageScore averageScore = new AverageScore();
        averageScore.getStrategy(new StrategyB());
        double[] a = {9.12,9.25,8.87,9.99,6.99,7.88};
        double average01 = averageScore.getAverage(a);
        System.out.println("B"+average01);

    }
}
