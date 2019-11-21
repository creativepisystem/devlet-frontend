package br.com.devlet.frontend;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Lists extends Application {
	
	private static Stage stage;
    
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
    	
        Parent root = FXMLLoader.load(getClass().getResource("components/lists/Lists.fxml"));
        Scene scene =  new Scene(root);
        stage.setTitle("Add");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        
        stage.setWidth(585);
        stage.setHeight(270);
        setStage(stage);
        stage.show();
        
    }

    public static Stage getStage() {
    	return stage;
    }
    
    public void setStage(Stage stage) {
    	Lists.stage = stage;
    }
}
