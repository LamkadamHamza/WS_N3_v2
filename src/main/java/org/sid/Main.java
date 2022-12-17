package org.sid;

import WS.BanqueService;
import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {

        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("le service web deploy dans adress http://0.0.0.0:9191/");
    }
}