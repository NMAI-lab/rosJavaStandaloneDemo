package rosJavaStandaloneDemo;

import org.ros.RosRun;
import org.ros.internal.loader.CommandLineLoader;
import org.ros.node.NodeConfiguration;

public class Launcher {

    public static void main(String[] args) {
        String myString = "Hello World!";
        System.out.println(myString);

        Listener newListener;

        //NodeConfiguration myNodeConfig = NodeConfiguration.newPublic("hostName");
        //CommandLineLoader myLoader = new CommandLineLoader();

    }
}
