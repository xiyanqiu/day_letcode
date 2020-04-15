package Thread.extendthr;

/**
 * @Auther:leeling
 * @Date:2020/2/13 Description:Thread
 * 继承Thread类实现线程
 */
public class example04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Person p1 = new Person("李四",sb);
        Person p2 = new Person("张三",sb);
        p1.start();
        p2.start();

    }
}
