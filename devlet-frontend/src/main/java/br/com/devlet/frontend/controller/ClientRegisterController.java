package br.com.devlet.frontend.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ClientRegisterController implements Initializable {

    @FXML
    private AnchorPane clientRegister;

    @FXML
    private Pane clientRegisterPanel;

    @FXML
    private Label clienteRegisterLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameText;

    @FXML
    private Label numberLabel;

    @FXML
    private TextField numberText;

    @FXML
    private Label nStuffLabel;

    @FXML
    private TextField nStuffText;

    @FXML
    private Label addressLabel;

    @FXML
    private TextField addressText;

    @FXML
    private Label phoneLabel;

    @FXML
    private TextField phoneText;

    @FXML
    private Label emailLabel;

    @FXML
    private TextField emailText;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;
    
    public void initialize() {
    	
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
    }

}
