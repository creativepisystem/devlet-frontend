package br.com.devlet.frontend;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Util {
	public static Parent loadResource(Class<?> c,String resource) throws IOException {
		return FXMLLoader.load(c.getClassLoader().getResource(resource));
	}
}
