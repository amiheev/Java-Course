package Thread;

/**
 * Created by student on 10/13/2015.
 */
public class WalkTalk {
    public static void main(String[] args){
        Talk talk = new Talk();
        Walk walk = new Walk();
        //Thread walk = new Thread( new Walk());
        talk.setDaemon(true);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        talk.start();

        walk.start();
    }
}
