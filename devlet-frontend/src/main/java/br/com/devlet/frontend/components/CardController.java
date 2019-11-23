package br.com.devlet.frontend.components;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class CardController implements Initializable{

    @FXML
    private AnchorPane card;

    @FXML
    private Label nomeProjeto;

    @FXML
    private Label nomeTarefa;

    @FXML
    private Label progressLabel;

    @FXML
    private Label progressPercent;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label dateCard;

    @FXML
    private Label statusCard;

    @FXML
    private Group detailsButton;

    @FXML
    private Circle openCardMenu;

    @FXML
    private HBox teamGroups;

    @FXML
    private HBox tagGroups;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

}
