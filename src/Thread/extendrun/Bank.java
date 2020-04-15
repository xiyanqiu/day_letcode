package Thread.extendrun;

/**
 * @Auther:leeling
 * @Date:2020/2/13 Description:Thread.extendrun
 * 实现runable接口从而来实现线程的运行，重写run方法
 */
public class Bank implements  Runnable{
    int count;
    public void setMoney(int i) {
        count = i;
    }

    @Override
    public void run() {
        while (true)
        {
            String name  = Thread.currentThread().getName();
            if(name.equals("ONE"))
            {
                if(count <= 160)
                {
                    System.out.println(name+"进入死亡状态");
                    return;
                }
                count += 10;
                System.out.println("我是"+name+"现在count="+count);
            }
            if(name.equals("TWO"))
            {
                if(count <= 0)
                {
                    System.out.println(name+"进入死亡状态");
                    return;
                }
                count -= 100;
                System.out.println("我是"+name+"现在count="+count);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
