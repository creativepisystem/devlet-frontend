package br.com.devlet.frontend.components;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.devlet.frontend.Lists;
import br.com.devlet.frontend.Router;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ListsController implements Initializable {

    @FXML
    private AnchorPane listsPanel;

    @FXML
    private VBox listsBox;

    @FXML
    private Pane panelItem1;

    @FXML
    private Label listClients;

    @FXML
    private ImageView addClientImage;

    @FXML
    private Pane panelItem2;

    @FXML
    private Label listStaff;

    @FXML
    private ImageView addColaboradorImage;
    
    public void initialize() {
    	
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
    	panelItem1.setOnMouseClicked(( MouseEvent event ) -> {
    		closeWindow();
    		listClient();
    	});
    	
    	panelItem2.setOnMouseClicked(( MouseEvent event ) -> {
    		closeWindow();
    		listStaff();
    	});
    	
    }
    
    public void listClient() {
    	try {
			Router.goTo("client");
		} catch ( Exception e ) {
			System.out.print(e.getStackTrace());
		}
    }
    
    public void listStaff() {
    	try {
			Router.goTo("staff");
		} catch ( Exception e ) {
			System.out.print(e.getStackTrace());
		}
    }
    
    public void closeWindow() {
    	Lists.getStage().close();
    }

}
