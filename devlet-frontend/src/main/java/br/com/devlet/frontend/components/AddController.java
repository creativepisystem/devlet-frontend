package br.com.devlet.frontend.components;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.devlet.frontend.Router;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class AddController implements Initializable {

	@FXML
	private AnchorPane addPanel;
	
    @FXML
    private VBox addBox;

    @FXML
    private Pane panelItem1;

    @FXML
    private Label addProject;

    @FXML
    private ImageView addProjectImage;

    @FXML
    private Pane panelItem2;

    @FXML
    private Label addProject1;

    @FXML
    private ImageView addClientImage;

    @FXML
    private Pane panelItem3;

    @FXML
    private Label addProject11;

    @FXML
    private ImageView addColaboradorImage;
    
    public void initialize() {
    	
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
    	panelItem1.setOnMouseClicked(( MouseEvent event ) -> {
    		newProject();
    	});
    	
    	panelItem2.setOnMouseClicked(( MouseEvent event ) -> {
    		newClient();
    	});
    	
    	panelItem3.setOnMouseClicked(( MouseEvent event ) -> {
    		newColaborador();
    	});
		
		File fileAddProject = new File("src/main/resources/br/com/devlet/frontend/assets/plus.png");
		Image add = new Image(fileAddProject.toURI().toString());
		
		addProjectImage.setImage(add);
		addClientImage.setImage(add);
		addColaboradorImage.setImage(add);
    }
    
    public void newProject() {
    	try {
			Router.goTo("newProject");
		} catch ( Exception e ) {
			System.out.print(e.getStackTrace());
		}
    }
    
    public void newClient() {
    	try {
			Router.goTo("clientRegister");
		} catch ( Exception e ) {
			System.out.print(e.getStackTrace());
		}
    }
    
    public void newColaborador() {
    	try {
			Router.goTo("staffRegister");
		} catch ( Exception e ) {
			System.out.print(e.getStackTrace());
		}
    }
    
}
