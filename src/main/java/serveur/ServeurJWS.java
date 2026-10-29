package serveur;

import service.Calculatrice;

import javax.xml.ws.Endpoint;

public class ServeurJWS {

    public static void main(String[] args) {
        String url = "http://localhost:9090/calculatrice";
        Endpoint.publish(url, new Calculatrice());

        System.out.println("Service SOAP publié avec succès !");
        System.out.println("WSDL : " + url + "?wsdl");
    }
}