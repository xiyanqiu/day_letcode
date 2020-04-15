package idustry;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:idustry
 */
public class BallPen {
    PenCore penCore;
    public void usePenCore(PenCore penCore)
    {
        this.penCore = penCore;
    }
    public void writewords(String s){
        penCore.writeWords(s);

    }
}
