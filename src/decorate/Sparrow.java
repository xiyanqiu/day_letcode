package decorate;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:decorate
 */
public class Sparrow extends Bird {
    public final int distance = 100;
    @Override
    int fly() {
        return distance;
    }
}
