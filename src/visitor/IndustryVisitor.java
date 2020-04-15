package visitor;

/**
 * @Auther:leeling
 * @Date:2020/2/10 Description:visitor
 */
public class IndustryVisitor implements Visitor {
    @Override
    public double visit(AmmeterElement element) {
        double charge = 0 ;
        double unitOne = 1.52,unitTwo = 2.78;
        int basic = 15000;
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
