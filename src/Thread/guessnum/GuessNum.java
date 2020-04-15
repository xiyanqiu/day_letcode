package Thread.guessnum;

/**
 * @Auther:leeling
 * @Date:2020/2/16 Description:Thread.guessnum
 */
public class GuessNum implements Runnable {
    Thread givenum,guessnum;
    Boolean guessright = false;
    Boolean givennum = false,guessednum = false;
    int realnum;

    GuessNum(){
        givenum = new Thread(this);
        guessnum = new Thread(this);
    }

    @Override
    public void run() {
        while (guessright != true)
        {
            giveandguess();
        }
        if (guessright == true)
        {
            return;
        }



    }
    public synchronized void giveandguess()
    {
        if(Thread.currentThread() == givenum && givennum == false)
        {
            realnum = (int) Math.random()*100;
            System.out.println("has given num");
            givennum = true;

        }



    }
}
