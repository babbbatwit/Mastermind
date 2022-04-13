import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) throws Exception {

		Pane p = new Pane();
		Scene s = new Scene(p, 400, 400);
		primaryStage.setScene(s);
		primaryStage.show();
		Tile masterTile = GameMaster.answerGen();
		System.out.println(masterTile.toString());
	}
}
