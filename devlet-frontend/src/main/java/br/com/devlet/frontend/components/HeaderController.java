package br.com.devlet.frontend.components;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class HeaderController implements Initializable {

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
    
    public void initialize() {
        	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		File fileHome = new File("src/main/resources/br/com/devlet/frontend/assets/home.png");
		Image home = new Image(fileHome.toURI().toString());
		homeImage.setImage(home);
		
		File fileReport = new File("src/main/resources/br/com/devlet/frontend/assets/report.png");
		Image report = new Image(fileReport.toURI().toString());
		reportImage.setImage(report);
		
		File fileAdd = new File("src/main/resources/br/com/devlet/frontend/assets/plus.png");
		Image add = new Image(fileAdd.toURI().toString());
		addImage.setImage(add);
		
		File fileFolder = new File("src/main/resources/br/com/devlet/frontend/assets/folder.png");
		Image folder = new Image(fileFolder.toURI().toString());
		projectsImage.setImage(folder);
		
		File fileUser = new File("src/main/resources/br/com/devlet/frontend/assets/user.png");
		Image user = new Image(fileUser.toURI().toString());
		userImage.setImage(user);		
		
	}

}
