package Thread.guessnum;

/**
 * @Auther:leeling
 * @Date:2020/2/16 Description:Thread.guessnum
 */
public class Example11 {
    public static void main(String[] args) {
        GuessNum number = new GuessNum();
        number.givenum.start();
        number.guessnum.start();
    }
}
