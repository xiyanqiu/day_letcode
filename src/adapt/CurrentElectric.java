package adapt;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:adapt
 */
public class CurrentElectric implements AlternateCurrent {
    @Override
    public String giveAlternateCurrent() {
        return "101010101010101010";
    }
}
