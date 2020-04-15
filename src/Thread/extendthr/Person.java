package Thread.extendthr;

/**
 * @Auther:leeling
 * @Date:2020/2/13 Description:Thread
 */
public class Person extends Thread {
    StringBuffer str;
    public Person(String name,StringBuffer str)
    {
        setName(name);
        this.str = str;
    }
    public void run(){
        for(int i =0;i<3;i++)
        {
            str.append(getName()+",");
            System.out.println("我是"+getName()+",字符串为："+str);
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
