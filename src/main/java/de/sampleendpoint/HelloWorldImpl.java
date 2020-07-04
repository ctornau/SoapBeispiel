package de.sampleendpoint;

import javax.jws.WebService;

@WebService(endpointInterface = "de.sampleendpoint.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHello(String name) {
        return "Hi " + name;
    }
}
