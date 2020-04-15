package visitor;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:visitor
 */
public class Application {
    public static void main(String[] args) {
        Visitor visitor01 = new HomeVisitor();
        Visitor visitor02 = new IndustryVisitor();
        AmmeterElement ammeter = new Ammeter();
        //这种方法没有体现一个电表可以被多个人看是不同的结果
//        ammeter.setElectricAmount(5678);
//        double result = visitor01.visit(ammeter);
//        System.out.println(result);
        ammeter.setElectricAmount(5678);
        ammeter.accept(visitor01);
        ammeter.accept(visitor02);



    }

}
