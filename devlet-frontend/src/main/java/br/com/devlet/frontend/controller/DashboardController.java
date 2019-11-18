package br.com.devlet.frontend.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class DashboardController implements Initializable {

    @FXML
    private AnchorPane navBar;

    @FXML
    private Button home;

    @FXML
    private Button report;

    @FXML
    private Button add;

    @FXML
    private Button projects;

    @FXML
    private Label titleBar;

    @FXML
    private ImageView homeImage;

    @FXML
    private ImageView reportImage;

    @FXML
    private ImageView addImage;

    @FXML
    private ImageView projectsImage;

    @FXML
    private ImageView userImage;

    @FXML
    private Label dashLabel;

    @FXML
    private TextField searchField;

    @FXML
    private Label numberOf;

    @FXML
    private Label of;

    @FXML
    private Label pathHome;

    @FXML
    private Label pathVariable;
    
    public void initialize() {
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
