package devlet;

import java.util.Scanner;

import br.com.devlet.frontend.rest.Request;

public class ExampleRest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while (true) {
			System.out.println("1-get , 2-post,3-put,4-delete");

			switch (new Scanner(System.in).nextInt()) {
			case 1:
				get();
				break;

			case 2:
				post();
				break;
			case 3:
				put();
				break;

			case 4:
				delete();
				break;
			}
		}
	}

	public static void get() {
		for (int i = 0; i < 1; i++) {
			Request request = new Request().url("/").get().header("teste", "teste").responseType(Mensagem.class)
					.onSucess(reponse -> {
						System.out.println("sucesso");
						System.out.println(reponse.getBody());
						System.out.println();
					}).onError(reponse -> {
						System.out.println("erro");
						System.out.println(reponse.getBody());
						System.out.println();
					});
			request.send();
		}
	}

	public static void delete() {
		for (int i = 0; i < 1; i++) {
			
			Request request = new Request().url("/").get().header("teste", "teste").responseType(Mensagem.class)
					.onSucess(reponse -> {
						System.out.println("sucesso");
						System.out.println(reponse.getBody());
						System.out.println();
					}).onError(reponse -> {
						System.out.println("erro");
						System.out.println(reponse.getBody());
						System.out.println();
					});
			request.send();
		}
	}

	public static void post() {
		for (int i = 0; i < 1; i++) {
			Request request = new Request().url("/").post().body(new Mensagem("post"))
					.responseType(Mensagem.class).onSucess(reponse -> {
						System.out.println("sucesso");
						System.out.println(reponse.getBody());
						System.out.println();
					}).onError(reponse -> {
						System.out.println("erro");
						System.out.println(reponse.getBody());
						System.out.println();
					});
			request.send();
		}
	}

	public static void put() {
		for (int i = 0; i < 1; i++) {
			Request request = new Request().url("/").put().header("teste", "teste").body(new Mensagem("post"))
					.responseType(Mensagem.class).onSucess(reponse -> {
						System.out.println("sucesso");
						System.out.println(reponse.getBody());
						System.out.println();
					}).onError(reponse -> {
						System.out.println("erro");
						System.out.println(reponse.getBody());
						System.out.println();
					});
			request.send();
		}
	}

}
