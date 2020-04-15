package Thread.threadint;

/**
 * @Auther:leeling
 * @Date:2020/2/13 Description:Thread.threadint
 */
public class Example07 {
    public static void main(String[] args) {
        Thread thread01;
        Count count = new Count();
        thread01 = new Thread(count);
        thread01.setName("李四");
        thread01.start();

    }
}
