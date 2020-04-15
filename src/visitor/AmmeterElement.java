package visitor;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:visitor
 */
//抽象方法
public abstract class AmmeterElement {
    public abstract void accept(Visitor visitor);
    public abstract double showElectricAmount();
    public abstract void setElectricAmount(double n);
}
