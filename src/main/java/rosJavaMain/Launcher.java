package rosJavaMain;


import exampleNode.Listener;
import org.ros.RosRun;

public class Launcher extends RosRun {

    public static void main(String[] argv) throws Exception {
        String myString = "Hello World!";
        System.out.println(myString);

        Listener newListener;
    }
}
