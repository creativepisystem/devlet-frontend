package devlet;

import org.springframework.web.client.RestTemplate;

public class Teste {

	public static void main(String[] args) {
		metodo();
	}
	public static void metodo() {
		RestTemplate rest = new RestTemplate();
		
		Adress response = rest.getForObject("https://viacep.com.br/ws/13336200/json/", Adress.class);
		System.out.println(response);
				
	}
	
	
}
