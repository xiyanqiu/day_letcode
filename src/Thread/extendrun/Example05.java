package Thread.extendrun;

/**
 * @Auther:leeling
 * @Date:2020/2/13 Description:Thread.extendrun
 *
 */
public class Example05 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setMoney(300);
        Thread thread1,thread2;
        thread1 = new Thread(bank);
        thread2 = new Thread(bank);
        thread1.setName("ONE");
        thread2.setName("TWO");
        thread1.start();
        thread2.start();

    }
}
