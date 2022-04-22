package it.saop.server;

import javax.xml.ws.Endpoint;

import it.soap.service.ImmobileSoapService;

public class serverjx {

	public static void main(String[] args) {
		String url = "http://0.0.0.0:8686/";
		Endpoint.publish(url, new ImmobileSoapService());
	}

}
