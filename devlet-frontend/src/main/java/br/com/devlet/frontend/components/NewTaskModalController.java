package br.com.devlet.frontend.components;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import br.com.devlet.frontend.NewTaskModal;
import br.com.devlet.frontend.Router;
import br.com.devlet.frontend.event.EventBus;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class NewTaskModalController implements Initializable {

    @FXML
    private AnchorPane newTaskModal;

    @FXML
    private Label statusLabel;

    @FXML
    private Label createdIn;

    @FXML
    private Label dateLabel;

    @FXML
    private Label by;

    @FXML
    private Label creatorLabel;

    @FXML
    private Label creatorLabel1;

    @FXML
    private Pane respondePane;

    @FXML
    private ImageView closeIcon;

    @FXML
    private Pane firstDivisor;

    @FXML
    private Label taskNameLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private ImageView descriptionIcon;

    @FXML
    private Pane firstDivisor1;

    @FXML
    private Label memberLabel;

    @FXML
    private GridPane teamGroups;

    @FXML
    private ImageView plusIcon;

    @FXML
    private Pane firstDivisor11;

    @FXML
    private Pane respondePaneComment;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnCancelar;
    
    public void initialize() {
    	
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
    	btnCancelar.setOnMouseClicked(( MouseEvent event ) -> {
    		closeWindow();
    	});
    	
    	btnSalvar.setOnMouseClicked(( MouseEvent event ) -> {
    		save();
    	});
    	
    }
    
    public void closeWindow() {
    	NewTaskModal.getStage().close();
    	EventBus.dispatch("modalClose",null);
			
    }
    
    @SuppressWarnings("unchecked")
	public void save() {
    	List<Object> columns = (List<Object>) Router.getProp("columns");
    	columns.add(new Object());
    	Router.addProp("columns", columns);
    }
    
}
