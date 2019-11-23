package br.com.devlet.frontend;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class DevletApplication extends Application{
	private static Stage stage;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
    	Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
    	stage.setY(0);
    	stage.setX(-7.6);
    	
    	Router.bind(this, stage,primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight());
    	Router.when("login","Login.fxml");
    	Router.when("register","Register.fxml");
    	Router.when("dashboard","Dashboard.fxml");
    	Router.when("flow","Flow.fxml");
    	Router.when("newProject","NewProject.fxml");
    	Router.when("clientRegister","ClientRegister.fxml");
    	Router.when("staffRegister","StaffRegister.fxml");
    	Router.when("client","Client.fxml");
    	Router.when("staff","Staff.fxml");
    	
    	
    	Router.goTo("login");
    }
   
    public static Stage getStage() {
    	return stage;
    }
    
    
    public static void setStage(Stage stage) {
    	DevletApplication.stage = stage;
    }

}
