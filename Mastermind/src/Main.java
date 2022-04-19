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
		
		
		
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resourses) {
		Pin pa1 = new Pin(ca1);
		Pin pa2 = new Pin(ca2);
		Pin pa3 = new Pin(ca3);
		Pin pa4 = new Pin(ca4);
		Tile t1 = new Tile(pa1,pa2,pa3,pa4);
		
		Pin pb1 = new Pin(cb1);
		Pin pb2 = new Pin(cb2);
		Pin pb3 = new Pin(cb3);
		Pin pb4 = new Pin(cb4);
		Tile t2 = new Tile(pb1,pb2,pb3,pb4);
		
		Pin pc1 = new Pin(cc1);
		Pin pc2 = new Pin(cc2);
		Pin pc3 = new Pin(cc3);
		Pin pc4 = new Pin(cc4);
		Tile t3 = new Tile(pc1,pc2,pc3,pc4);
		
		Pin pd1 = new Pin(cd1);
		Pin pd2 = new Pin(cd2);
		Pin pd3 = new Pin(cd3);
		Pin pd4 = new Pin(cd4);
		Tile t4 = new Tile(pd1,pd2,pd3,pd4);
		
		Pin pe1 = new Pin(ce1);
		Pin pe2 = new Pin(ce2);
		Pin pe3 = new Pin(ce3);
		Pin pe4 = new Pin(ce4);
		Tile t5 = new Tile(pe1,pe2,pe3,pe4);
		
		Pin pf1 = new Pin(cf1);
		Pin pf2 = new Pin(cf2);
		Pin pf3 = new Pin(cf3);
		Pin pf4 = new Pin(cf4);
		Tile t6 = new Tile(pf1,pf2,pf3,pf4);
		
		Pin pg1 = new Pin(cg1);
		Pin pg2 = new Pin(cg2);
		Pin pg3 = new Pin(cg3);
		Pin pg4 = new Pin(cg4);
		Tile t7 = new Tile(pg1,pg2,pg3,pg4);
		
		Pin ph1 = new Pin(ch1);
		Pin ph2 = new Pin(ch2);
		Pin ph3 = new Pin(ch3);
		Pin ph4 = new Pin(ch4);
		Tile t8 = new Tile(ph1,ph2,ph3,ph4);
		
		Pin answer1 = new Pin(ci1);
		Pin answer2 = new Pin(ci2);
		Pin answer3 = new Pin(ci3);
		Pin answer4 = new Pin(ci4);
		Tile answerTile = new Tile(answer1,answer2, answer3, answer4);
		answerTile.answerGen();
		
		int rounds = 0;
		boolean gameOver = false;
		
		while(rounds < 9 && gameOver == false) {
			
		}
		
		
		System.out.println(answerTile.toString());
		ci1.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent mouseEvent) {
	            pa1.onClick();
	        }
	    });
		}
}
