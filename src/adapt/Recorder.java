package adapt;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:adapt
 */
public class Recorder {
    String name;
    Recorder(){
        name = "收音机";
    }
    Recorder(String s)
    {
        name = s;
    }
    public void turnon(ObjectC obc)
    {
       String s = obc.giveDirectCurrent();
       System.out.println(name+"使用直流电:"+s);
       System.out.println();
       System.out.println("正在录音");
    }

}
