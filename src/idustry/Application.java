package idustry;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:idustry
 */
public class Application {
    public static void main(String[] args) {
        BallPen ballPen = new BallPen();
        PenCore core;
        PenCoreCreator creator;
        creator = new RedPenCoreCreator();
        core = creator.getPenCore();
        ballPen.usePenCore(core);
        ballPen.writewords("NICE TO MEET YOU!");
    }
}
