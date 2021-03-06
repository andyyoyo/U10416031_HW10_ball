import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.scene.Scene;

public class BounceBallContral extends Application{
	public void start(Stage primaryStage){
		BallPane ballPane = new BallPane();
		
		ballPane.setOnMousePressed(e->ballPane.pause());
		ballPane.setOnMouseReleased(e->ballPane.play());
		
		ballPane.setOnKeyPressed(e->{
			if(e.getCode()==KeyCode.UP){
				ballPane.increaseSpeed();
			}
			else if(e.getCode()==KeyCode.DOWN){
				ballPane.decreaseSpeed();
			}
			//press the Q button to change the color
			else if(e.getCode()==KeyCode.Q){
				BallPane.changeColor();
		});
		
		Scene scene = new Scene(ballPane,500,500);
		primaryStage.setTitle("BounceBallControl");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		ballPane.requestFocus();
	}
	
	public static void main (String[] args){
		launch(args);
	}
}
