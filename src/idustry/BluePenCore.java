package idustry;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:idustry
 */
public class BluePenCore extends PenCore{
    BluePenCore(){
        color = "蓝色";
    }
    @Override
    public void writeWords(String s) {
        System.out.println("写出"+color+"的字："+s);

    }
}
