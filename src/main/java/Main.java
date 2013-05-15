import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * Created with IntelliJ IDEA.
 * User: aybek.buka
 * Date: 02.05.13
 * Time: 0:12
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String args[]) throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        twitter.updateStatus("Wow it works 2!!");
        System.out.println("success");
    }
}
