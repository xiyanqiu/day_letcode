package decorate;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:decorate
 */
public class NewFly {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        System.out.println("没有安装翅膀的小鸟能飞行的距离为"+bird.fly());
        bird = new SparrowDecorator(bird);
        System.out.println("安装了一个电子翅膀的小鸟能飞行的距离为"+bird.fly());
        bird = new SparrowDecorator(bird);
        System.out.println("安装了两个电子翅膀的小鸟能飞行的距离为"+bird.fly());

    }
}
