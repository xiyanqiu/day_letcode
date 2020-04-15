package Thread.synch;

/**
 * @Auther:leeling
 * @Date:2020/2/14 Description:Thread.synch
 */
public class Bank implements Runnable{
    int money;
    String name;
    public synchronized void option(int count){
        if(Thread.currentThread().getName().equals("会计"))
        {
            for(int i = 0; i<3;i++){
            money = money + count;
            System.out.println(Thread.currentThread().getName()+"开始工作，现在账号有"+money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
        }
        if(Thread.currentThread().getName().equals("出纳"))
        {
            for(int i = 0;i<2;i++){
            money = money - count;
            System.out.println(Thread.currentThread().getName()+"开始工作，现在账号有"+money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
        }


    }
    @Override
    public void run() {
        name = Thread.currentThread().getName();
        if(name.equals("会计"))
        {
            option(90);
        }
        if(name.equals("出纳"))
        {
            option(30);
        }

    }

    public void setMoney(int i) {
        money = i;

    }
}
