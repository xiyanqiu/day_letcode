package strategy;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:strategy
 *
 * 上下文和具体策略是松耦合关系
 * 满足开闭原则：当需要添加新的策略时，不需要修改上下文的代码，上下文就可以引用新的策略
 *
 */
public class AverageScore {
    Strategy strategy;
    public void getStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }
    public double getAverage(double[] a)
    {
        if(strategy != null)
        {
            return strategy.computerAverage(a);
        }
        else
            {
                System.out.println("没有求平均值的算法，所以不能计算");
                return -1;
            }
    }




}
