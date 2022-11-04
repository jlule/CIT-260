import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;


public class JavaFXBlank extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
//		Image im = new Image("skill.jpg");
//		ImageView iv = new ImageView(im);
//		
//		Pane pane = new Pane();
//		Scene scene = new Scene(pane, im.getWidth(), im.getHeight());
//		primaryStage.setTitle("Draw Something");
//		primaryStage.setScene(scene);
//		pane.getChildren().add(iv);	

		Pane pane = new Pane();
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Draw Something");
		primaryStage.setScene(scene);
		primaryStage.show();

		Line m = new Line(100, 100, 200, 100);
		m.setStroke(Color.RED);

		Arc a = new Arc(325, 200, 50, 50, 0, 45);
		a.setStroke(Color.BLUE);
		a.setFill(Color.BLUE);
		a.setType(ArcType.ROUND);
		
		Arc b = new Arc(325, 200, 50, 50, 90, 45);
		a.setStroke(Color.RED);
		a.setFill(Color.RED);
		a.setType(ArcType.ROUND);
		pane.getChildren().addAll(m,a,b);

	}

}
