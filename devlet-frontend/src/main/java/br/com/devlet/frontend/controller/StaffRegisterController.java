package br.com.devlet.frontend.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class StaffRegisterController implements Initializable {

    @FXML
    private AnchorPane staffRegister;

    @FXML
    private Pane staffPanel;

    @FXML
    private Label staffLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private TextField emailText;

    @FXML
    private Label areaLabel;

    @FXML
    private TextField areaText;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameText;

    @FXML
    private Label identityLabel;

    @FXML
    private TextField identityText;

    @FXML
    private Label phoneLabel;

    @FXML
    private TextField phoneText;

    @FXML
    private Label obsLabel;

    @FXML
    private TextArea obsTextArea;

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
