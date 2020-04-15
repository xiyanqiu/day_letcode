package visitor;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:visitor
 */
//抽象方法的实现



public class Ammeter extends AmmeterElement {
    double electricAmount;
    @Override
    public void accept(Visitor visitor) {
        //***very important 这个传进去的参数是this
        double charge = visitor.visit(this);
        System.out.println("电表需要交纳"+charge+"RMB");
    }

    @Override
    public double showElectricAmount() {
        return electricAmount;
    }


    @Override
    public void setElectricAmount(double n) {
        electricAmount = n;

    }
}
