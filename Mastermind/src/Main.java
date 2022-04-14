import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application implements Initializable{
	public static void main(String[] args) {
		launch(args);
	}
	
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
		
	}
}
