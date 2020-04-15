package decorate;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:decorate
 */
public class SparrowDecorator extends Decorator {
    //重写父类的构造方法,不重写构造方法没有办法重新传入bird类型的参数。默认是传入空参
//    SparrowDecorator(Bird bird)
//    {
//        super(bird);
//    }
    public final int distance = 50;

    public SparrowDecorator(Bird bird) {
        this.bird = bird;
    }

    @Override
    public int elseFly() {
        return distance;
    }

    @Override
    int fly() {
        int sum = 0;
        sum = bird.fly() + elseFly();
        return sum;
    }
}
