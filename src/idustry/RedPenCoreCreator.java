package idustry;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:idustry
 */
public class RedPenCoreCreator extends PenCoreCreator {
    @Override
    public PenCore getPenCore() {
        return new RenPenCore();
    }
}
