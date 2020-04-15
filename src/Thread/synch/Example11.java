package Thread.synch;

/**
 * @Auther:leeling
 * @Date:2020/2/14 Description:Thread.synch
 */
public class Example11 {

    public static void main(String[] args) {
        Bank bank;
        Thread counter,user;
        bank = new Bank();
        bank.setMoney(100);
        counter = new Thread(bank);
        user = new Thread(bank);
        counter.setName("会计");
        user.setName("出纳");
        counter.start();
        user.start();

    }
}
