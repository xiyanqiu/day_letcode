package Thread.threadint;

/**
 * @Auther:leeling
 * @Date:2020/2/13 Description:Thread.threadint
 *
 * 在线程中启动新的线程
 */
public class Count implements Runnable {
    int i = 1,sum = 0;
    @Override
    public void run() {
        //得到现有thread的name
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"开始计算了");
        while (i<=10)
        {
            sum = sum +i ;
            System.out.println(" " +sum);
            if(i == 5)
            {
                //重要  创建新线程，传入this，同一目标
                Thread thread2 = new Thread(this);
                thread2.setName("赵四");
                thread2.start();
                //使得线程1死亡
                i++;
                return;
            }
            i++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
