package adapt;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:adapt
 */
public class Wash {
    String name;
    Wash(){
        name = "洗衣机";
    }
    Wash(String s)
    {
        name = s;
    }
    public void turnon(AlternateCurrent a)
    {
        String s = a.giveAlternateCurrent();
        System.out.println(name+"使用交流电:"+s);
        System.out.println();
        System.out.println("正在洗衣服");
    }
}
