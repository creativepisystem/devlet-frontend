package br.com.devlet.frontend.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.com.devlet.frontend.NewTaskModal;
import br.com.devlet.frontend.Router;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FlowController implements Initializable {

	@FXML
    private AnchorPane flow;

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

    @FXML
    private HBox flowContainer;

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
		Router.addProp("columns",new ArrayList<Object>());
		firstPane.setOnMouseClicked(( MouseEvent event ) -> {
			addNewTaskModal();
		});
		
	}
	
	public void addNewTaskModal() {
		NewTaskModal newTaskModal = new NewTaskModal();
		try {
			newTaskModal.start(new Stage());
		} catch ( Exception e ) {
			System.out.print(e.getStackTrace());
		}
		
		
	}
	
	public void add() {
		
		flowContainer.getChildren().add(scroll);
		List<Object> columns = (List<Object>) Router.getProp("columns");
		try {
			for (Object object : columns) {
				ScrollPane newLoadedPane = FXMLLoader.load(getClass().getClassLoader().getResource("br/com/devlet/frontend/components/column/Column.fxml"));
				flowContainer.getChildren().add(newLoadedPane);				
			}
		} catch ( Exception e ) {
			System.out.print(e);
		}
	}

}
