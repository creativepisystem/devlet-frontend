package br.com.devlet.frontend.components;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.devlet.frontend.controller.FlowController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ColumnController implements Initializable {

    @FXML
    private ScrollPane scroll;

    @FXML
    private VBox verticalContainer;

    @FXML
    private Pane firstPane;

    @FXML
    private ImageView plusIcon;

    @FXML
    private Label addTaskLabel;
    
    public void initialize() {
    	
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
    	firstPane.setOnMouseClicked(( MouseEvent event ) -> {
    		addColumn();
    	});
    }
    
    public void addColumn() {
    	FlowController flowController = new FlowController();
    	flowController.addNewTaskModal();
    }

}