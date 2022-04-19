import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application implements Initializable{
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@FXML
	Circle ca1;
	@FXML
	Circle ca2;
	@FXML
	Circle ca3;
	@FXML
	Circle ca4;
	@FXML
	Circle cb1;
	@FXML
	Circle cb2;
	@FXML
	Circle cb3;
	@FXML
	Circle cb4;
	@FXML
	Circle cc1;
	@FXML
	Circle cc2;
	@FXML
	Circle cc3;
	@FXML
	Circle cc4;
	@FXML
	Circle cd1;
	@FXML
	Circle cd2;
	@FXML
	Circle cd3;
	@FXML
	Circle cd4;
	@FXML
	Circle ce1;
	@FXML
	Circle ce2;
	@FXML
	Circle ce3;
	@FXML
	Circle ce4;
	@FXML
	Circle cf1;
	@FXML
	Circle cf2;
	@FXML
	Circle cf3;
	@FXML
	Circle cf4;
	@FXML
	Circle cg1;
	@FXML
	Circle cg2;
	@FXML
	Circle cg3;
	@FXML
	Circle cg4;
	@FXML
	Circle ch1;
	@FXML
	Circle ch2;
	@FXML
	Circle ch3;
	@FXML
	Circle ch4;
	@FXML
	Circle ci1;
	@FXML
	Circle ci2;
	@FXML
	Circle ci3;
	@FXML
	Circle ci4;
	@FXML
	Circle aa1;
	@FXML
	Circle aa2;
	@FXML
	Circle aa3;
	@FXML
	Circle aa4;
	@FXML
	Circle ab1;
	@FXML
	Circle ab2;
	@FXML
	Circle ab3;
	@FXML
	Circle ab4;
	@FXML
	Circle ac1;
	@FXML
	Circle ac2;
	@FXML
	Circle ac3;
	@FXML
	Circle ac4;
	@FXML
	Circle ad1;
	@FXML
	Circle ad2;
	@FXML
	Circle ad3;
	@FXML
	Circle ad4;
	@FXML
	Circle ae1;
	@FXML
	Circle ae2;
	@FXML
	Circle ae3;
	@FXML
	Circle ae4;
	@FXML
	Circle af1;
	@FXML
	Circle af2;
	@FXML
	Circle af3;
	@FXML
	Circle af4;
	@FXML
	Circle ag1;
	@FXML
	Circle ag2;
	@FXML
	Circle ag3;
	@FXML
	Circle ag4;
	@FXML
	Circle ah1;
	@FXML
	Circle ah2;
	@FXML
	Circle ah3;
	@FXML
	Circle ah4;
	
	
	
	@FXML
	Button b;
	
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Mastermind.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Mastermind");
		primaryStage.setScene(scene);
		primaryStage.show();
		Tile masterTile = GameMaster.answerGen();
		System.out.println(masterTile.toString());
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resourses) {
		Pin pin = new Pin(0,ca1);
		ca1.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent mouseEvent) {
	            pin.onClick();
	        }
	    });
		}
}
