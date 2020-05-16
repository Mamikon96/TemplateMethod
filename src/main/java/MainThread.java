import templates.applications.Application;
import templates.applications.BallApplication;
import templates.applications.SquareApplication;
import templates.applications.StarApplication;

public class MainThread {

    public static void main(String[] args) {

        Application app = new BallApplication();
//        app = new SquareApplication();
//        app = new StarApplication();
        app.run();
    }

}