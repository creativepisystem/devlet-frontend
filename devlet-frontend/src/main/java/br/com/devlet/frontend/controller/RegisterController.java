package br.com.devlet.frontend.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.devlet.frontend.Login;
import br.com.devlet.frontend.Register;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RegisterController implements Initializable {

    @FXML
    private Pane container;

    @FXML
    private Pane sidePane;

    @FXML
    private TextField emailField;

    @FXML
    private Label devletLabel;

    @FXML
    private Label registerLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label userLabel;

    @FXML
    private Button registerButton;

    @FXML
    private Label alreadyRegister;

    @FXML
    private Label doLogin;

    @FXML
    private TextField userField;

    @FXML
    private Label passLabel;

    @FXML
    private TextField passField;
    
    public void initialize() {
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		doLogin.setOnMouseClicked(( MouseEvent e ) -> {
			changeToLogin();
			closeWindow();
		});
		
	}

    @FXML
    void changeToLogin() {
  
		Login login = new Login();    		
		
		try {
			
			login.start(new Stage());
			
		} catch ( Exception error ) {
			
			System.out.print("Deu Ruim");
		
		}
    }
    
    @FXML
    void closeWindow() {
    	Register.getStage().close();
    }
	

}
