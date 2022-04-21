import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application implements Initializable{
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Button start = new Button("Start");
		start.setTranslateX(188);
		start.setTranslateY(440);
		Label rules = new Label();
		rules.setText("Welcome to Mastermind.\n" +
                "\n" +
                "The objective of the game is to correctly guess a secret code consisting\n" +
                "of a series of 4 colored pegs.\n\n" +
                "Each peg will be of one of 6 colors – Blue, Green, Orange, Purple, Red,\nand Yellow.\n" +
                "More than one peg in the secret code could be of the same color.\nYou must guess the correct color " +
                "and order of the code.\n\n" +
                "You will have 10 chances to correctly guess the code.\n\nAfter every guess, the computer " +
                "will provide you feedback in the\n form of 0 to 4 colored pegs. A black peg indicates " +
                "that a peg in your guess is\nof the correct color and is in the correct position.\n" +
                "A white peg indicates that a peg in your guess is of the correct color\n" +
                "but is not in the correct position.\n\n" +
                "NOTE: The order of the feedback pegs does not correspond to either the\npegs in the code " +
                "or the pegs in your guess. " +
                "\nIn other words, the color of the pegs is important, not the order they are in.\n\n");
		rules.setTextAlignment(TextAlignment.CENTER);
		
		start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
                try {
					game(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }
        });
		
		Group g = new Group(start,rules);
		Scene s = new Scene(g,418,520);
		primaryStage.setScene(s);
		primaryStage.show();
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
	HBox gameBox;
	@FXML
	VBox box1;
	@FXML
	VBox box2;
	@FXML
	VBox box3;
	@FXML
	VBox box4;
	@FXML
	VBox box5;
	@FXML
	VBox box6;
	@FXML
	VBox box7;
	@FXML
	VBox box8;
	@FXML
	VBox answerBox;
	@FXML
	VBox hb1;
	@FXML
	VBox hb2;
	@FXML
	VBox hb3;
	@FXML
	VBox hb4;
	@FXML
	VBox hb5;
	@FXML
	VBox hb6;
	@FXML
	VBox hb7;
	@FXML
	VBox hb8;
	@FXML
	Button b;
	
	Tile currentTile;
	
	HitAndBlows currentHAB;
	
	public void game(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Mastermind.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Mastermind");
		stage.setScene(scene);
		stage.show();
	
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resourses) {
		Pin pa1 = new Pin(ca1);
		Pin pa2 = new Pin(ca2);
		Pin pa3 = new Pin(ca3);
		Pin pa4 = new Pin(ca4);
		Tile t1 = new Tile(pa1,pa2,pa3,pa4,box1);
		
		Pin pb1 = new Pin(cb1);
		Pin pb2 = new Pin(cb2);
		Pin pb3 = new Pin(cb3);
		Pin pb4 = new Pin(cb4);
		Tile t2 = new Tile(pb1,pb2,pb3,pb4,box2);
		
		Pin pc1 = new Pin(cc1);
		Pin pc2 = new Pin(cc2);
		Pin pc3 = new Pin(cc3);
		Pin pc4 = new Pin(cc4);
		Tile t3 = new Tile(pc1,pc2,pc3,pc4,box3);
		
		Pin pd1 = new Pin(cd1);
		Pin pd2 = new Pin(cd2);
		Pin pd3 = new Pin(cd3);
		Pin pd4 = new Pin(cd4);
		Tile t4 = new Tile(pd1,pd2,pd3,pd4,box4);
		
		Pin pe1 = new Pin(ce1);
		Pin pe2 = new Pin(ce2);
		Pin pe3 = new Pin(ce3);
		Pin pe4 = new Pin(ce4);
		Tile t5 = new Tile(pe1,pe2,pe3,pe4,box5);
		
		Pin pf1 = new Pin(cf1);
		Pin pf2 = new Pin(cf2);
		Pin pf3 = new Pin(cf3);
		Pin pf4 = new Pin(cf4);
		Tile t6 = new Tile(pf1,pf2,pf3,pf4,box6);
		
		Pin pg1 = new Pin(cg1);
		Pin pg2 = new Pin(cg2);
		Pin pg3 = new Pin(cg3);
		Pin pg4 = new Pin(cg4);
		Tile t7 = new Tile(pg1,pg2,pg3,pg4,box7);
		
		Pin ph1 = new Pin(ch1);
		Pin ph2 = new Pin(ch2);
		Pin ph3 = new Pin(ch3);
		Pin ph4 = new Pin(ch4);
		Tile t8 = new Tile(ph1,ph2,ph3,ph4,box8);
		
		HitAndBlows h1 = new HitAndBlows(aa1,aa2,aa3,aa4,hb1);
		HitAndBlows h2 = new HitAndBlows(ab1,ab2,ab3,ab4,hb2);
		HitAndBlows h3 = new HitAndBlows(ac1,ac2,ac3,ac4,hb3);
		HitAndBlows h4 = new HitAndBlows(ad1,ad2,ad3,ad4,hb4);
		HitAndBlows h5 = new HitAndBlows(ae1,ae2,ae3,ae4,hb5);
		HitAndBlows h6 = new HitAndBlows(af1,af2,af3,af4,hb6);
		HitAndBlows h7 = new HitAndBlows(ag1,ag2,ag3,ag4,hb7);
		HitAndBlows h8 = new HitAndBlows(ah1,ah2,ah3,ah4,hb8);
		
		HitAndBlows[] habArr = {h1,h2,h3,h4,h5,h6,h7,h8};
		currentHAB = h1;
		Pin answer1 = new Pin(ci1);
		Pin answer2 = new Pin(ci2);
		Pin answer3 = new Pin(ci3);
		Pin answer4 = new Pin(ci4);
		Tile answerTile = new Tile(answer1,answer2, answer3,answer4,answerBox);
		
		HashMap<Circle,Pin> map=new HashMap<Circle,Pin>();
		
		Tile[] tileArr = {t1,t2,t3,t4,t5,t6,t7,t8};
		currentTile = t1;
		map.put(ca1, pa1);
		map.put(ca2, pa2);
		map.put(ca3, pa3);
		map.put(ca4, pa4);
		
		map.put(cb1, pb1);
		map.put(cb2, pb2);
		map.put(cb3, pb3);
		map.put(cb4, pb4);
		
		map.put(cc1, pc1);
		map.put(cc2, pc2);
		map.put(cc3, pc3);
		map.put(cc4, pc4);
		
		map.put(cd1, pd1);
		map.put(cd2, pd2);
		map.put(cd3, pd3);
		map.put(cd4, pd4);
		
		map.put(ce1, pe1);
		map.put(ce2, pe2);
		map.put(ce3, pe3);
		map.put(ce4, pe4);
		
		map.put(cf1, pf1);
		map.put(cf2, pf2);
		map.put(cf3, pf3);
		map.put(cf4, pf4);
		
		map.put(cg1, pg1);
		map.put(cg2, pg2);
		map.put(cg3, pg3);
		map.put(cg4, pg4);
		
		map.put(ch1, ph1);
		map.put(ch2, ph2);
		map.put(ch3, ph3);
		map.put(ch4, ph4);
		
		answerTile.answerGen();
		currentTile.activatePins();
		currentTile.setOpacity(1);
		
		System.out.println(answerTile.toString());
		gameBox.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent mouseEvent) {
	        	if(mouseEvent.getTarget() instanceof Circle) {
		        	map.get((Circle) mouseEvent.getTarget()).onClick();
	        	}
	        }
	    });
		
		b.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	if(GameMaster.getRound() <  8 && GameMaster.checkGameOver() == false) {
		    		currentHAB.hits(currentTile, answerTile);
		    		currentHAB.blows(currentTile, answerTile);
		    		currentHAB.displayColors();
		    		currentHAB.setOpacity(1);
			    	GameMaster.increaseRound();
			    	if(currentTile.equals(answerTile)) {
			    		GameMaster.setGameOver();
			    		b.setText("You won!");
			    		answerTile.setOpacity(1);
			    		answerTile.updatePinColor();
			    	}
			    	else if(GameMaster.getRound() == 8) {
			    		GameMaster.setGameOver();
			    		b.setText("You lost :(");
			    		answerTile.setOpacity(1);
			    		answerTile.updatePinColor();
			    	}
			    	else {
			    		currentTile.deactivatePins();
				    	currentTile = tileArr[GameMaster.getRound()];
				    	currentHAB = habArr[GameMaster.getRound()];
				    	currentTile.setOpacity(1);
				    	currentTile.activatePins();
			    	}			    	
		    	}

		    }
		});
		}
}
