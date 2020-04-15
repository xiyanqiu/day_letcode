package decorate;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:decorate
 */
public abstract class Decorator extends Bird {
    Bird bird;
    public Decorator(){

    }
    public Decorator(Bird bird)
    {
        this.bird = bird;
    }
    public abstract int elseFly();

//    //抽象方法可以不重写bird的实现方法
//    @Override
//    int fly() {
//        return 0;
//    }
}
