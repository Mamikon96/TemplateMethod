import applications.Application;
import applications.BallApplication;
import applications.SquareApplication;
import applications.StarApplication;

public class MainThread {

    public static void main(String[] args) {

        Application app = new BallApplication();
//        app = new SquareApplication();
//        app = new StarApplication();
        app.run();
    }

}