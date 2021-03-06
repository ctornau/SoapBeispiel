import de.sampleendpoint.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Der Client
 */
public class HelloWorldExampleClient {

    public static void main(String[]args) throws Exception {

        URL url = new URL("http://localhost:8888/ws/hello?wsdl");
        QName qname = new QName("http://sampleendpoint.de/", "HelloWorldImplService");
        Service service = Service.create(url, qname);

        // Hinweis: Hier wird nur das Interface HelloWorld genutzt, nicht die Implementierung!
        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.sayHello("Programmer"));
    }
}
