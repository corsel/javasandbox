import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.geometry.*;
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
		
		Arc arc = new Arc();
		arc.setStartAngle(0.0F);
		arc.setCenterX(50.0F);
		arc.setLength(120.0F);
		arc.setRadiusX(25.0F);
		arc.setRadiusY(25.0F);
		arc.setType(ArcType.ROUND);
		arc.setFill(Color.CRIMSON);
		
		TextField textField = new TextField("Deneme text field");
		textField.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent argEvent) {
				Integer value = Integer.parseInt(textField.getText());
				arc.setLength(value);
			}
		});
		
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10, 10, 10, 10));
		vbox.setPrefWidth(200);
		vbox.getChildren().addAll(button, textField, arc);
		root.getChildren().add(vbox);
		
		stage.setTitle("Deneme");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
  }
}	