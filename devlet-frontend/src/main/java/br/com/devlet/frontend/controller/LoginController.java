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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private Pane container;

    @FXML
    private Pane sidePane;

    @FXML
    private TextField userField;

    @FXML
    private Label devletLabel;

    @FXML
    private Label loginLabel;

    @FXML
    private Label userLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Button loginButton;

    @FXML
    private Label noRegister;

    @FXML
    private Label createAccount;

    @FXML
    private Button googleButton;

    @FXML
    private ImageView googleIcon;

    @FXML
    private TextField emailField;

    public void initialize() {
    	
    }
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	createAccount.setOnMouseClicked(( MouseEvent event ) -> {
    		changeToRegister();
    		closeWindow();
    	});
	}
    
    public void changeToRegister() {
    	Register register = new Register();
    	try {
    		register.start(new Stage());
    	} catch ( Exception error ) {
    		System.out.print(error.getStackTrace());
    	}
    };
    
    public void closeWindow() {
    	Login.getStage().close();
    }



}
