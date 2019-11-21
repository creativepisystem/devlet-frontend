package br.com.devlet.frontend;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class StaffRegister extends Application {

	private static Stage stage;
    
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StaffRegister.fxml"));
        Scene scene =  new Scene(root);
        stage.setTitle("Cadastro Colaborador");
        stage.setScene(scene);
        
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());
        setStage(stage);
        stage.show();
        
    }

    public static Stage getStage() {
    	return stage;
    }
    
    public void setStage(Stage stage) {
    	StaffRegister.stage = stage;
    }
}
