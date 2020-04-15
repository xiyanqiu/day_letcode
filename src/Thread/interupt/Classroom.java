package Thread.interupt;

/**
 * @Auther:leeling
 * @Date:2020/2/14 Description:Thread.interupt
 */
public class Classroom implements Runnable {
    Thread student;
    Thread teacher;
    Classroom(){
        student = new Thread(this);
        teacher = new Thread(this);
        student.setName("张爱睡");
        teacher.setName("雷老师");
    }
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("张爱睡"))
        {
            System.out.println(Thread.currentThread().getName()+"正在睡觉，不听课");
            try {
                Thread.sleep(1000*60*60);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"被老师叫醒了");

            }
            System.out.println("开始听课。");
        }
        if(Thread.currentThread().getName().equals("雷老师"))
        {
            System.out.println(Thread.currentThread().getName()+"上课！");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            student.interrupt();    //叫醒学生的线程
        }


    }
}
