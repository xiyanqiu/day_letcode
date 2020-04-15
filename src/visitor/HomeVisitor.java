package visitor;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:visitor
 */
public class HomeVisitor implements  Visitor {
    @Override
    public double visit(AmmeterElement element) {
        double charge = 0 ;
        double unitOne = 0.6,unitTwo = 1.05;
        int basic = 6000;
        //
        double n = element.showElectricAmount();
        if(n<=basic)
        {
            charge = n*unitOne;
        }
        else
            {
                charge = basic*unitOne +(n-basic)*unitTwo;
            }
        return charge;
    }
}
