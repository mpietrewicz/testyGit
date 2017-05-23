/**
 * Created by Marek on 2017-05-16.
 */
public class MainImp {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Thread thread = new Thread(timer);
        thread.start();
        System.out.println("Start");
    }
}
