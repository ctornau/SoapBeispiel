import de.sampleendpoint.HelloWorldImpl;
import javax.xml.ws.Endpoint;

/**
 * Der Server
 */
public class HalloWorldExampleApp {

    public static void main(String[]args) {
        Endpoint.publish("http://localhost:8888/ws/hello", new HelloWorldImpl());
    }
}