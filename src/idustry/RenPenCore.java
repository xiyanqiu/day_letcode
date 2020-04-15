package idustry;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:idustry
 */
public class RenPenCore extends PenCore{
    RenPenCore(){
        color = "红色";
    }
    @Override
    public void writeWords(String s) {
        System.out.println("写出"+color+"的字："+s);

    }
}
