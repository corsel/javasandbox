import javafx.application.Application;
import javafx.scene.*;
// import javafx.scene.canvas.*;
// import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.geometry.Pos;
import javafx.event.*;
import javafx.stage.Stage;

public class Deneme extends Application {
	@Override
	public void start(Stage stage) {
		Group root = new Group();
		Scene scene  = new Scene(root,600,480);
		/*
		final Canvas canvas = new Canvas(300, 300);
		canvas.getGraphicsContext2D().setFill(Color.BLUE);
		canvas.getGraphicsContext2D().fillRect(0.0F, 0.0F, 300.0F, 300.0F);
		root.getChildren().add(canvas);
		*/
		
		Button button = new Button("Deneme Button");
		button.setAlignment(Pos.CENTER);
		button.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent argEvent) {
			  button.setText("clicked!");
			}
		});
		root.getChildren().add(button);
		
		stage.setTitle("Deneme");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
  }
}	