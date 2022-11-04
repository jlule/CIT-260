import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class A15dot4 extends Application{
	
//	get our variables

    double digit1 = 0;
    double digit2 = 0;
    double answer = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox numberPane = new HBox();
        numberPane.setSpacing(15);
        numberPane.setAlignment(Pos.CENTER);
        
        
//        create the text fields

        Label labelNumber1 = new Label("Number 1:");
        TextField tfNumber1 = new TextField();

        Label lblNumber2 = new Label("Number 2:");
        TextField tfNumber2 = new TextField();

        Label lblResult = new Label("Result :");
        TextField tfResult = new TextField();

        numberPane.getChildren().addAll(
        		labelNumber1, tfNumber1,
                lblNumber2, tfNumber2,
                lblResult, tfResult);

        Button buttonAdd = new Button("Add");
        buttonAdd.setOnAction(e -> {
            answer = Double.parseDouble(tfNumber1.getText()) + Double.parseDouble(tfNumber2.getText());
            tfResult.setText(answer + "");
        });

        Button buttonSubtract = new Button("subtract");
        buttonSubtract.setOnAction(e -> {
            answer = Double.parseDouble(tfNumber1.getText()) - Double.parseDouble(tfNumber2.getText());
            tfResult.setText(answer + "");
        });
        Button buttonMultiply = new Button("Multiply");
        buttonMultiply.setOnAction(e -> {
            answer = Double.parseDouble(tfNumber1.getText()) * Double.parseDouble(tfNumber2.getText());
            tfResult.setText(answer + "");
        });
        Button buttonDivide = new Button("Divide");
        buttonDivide.setOnAction(e -> {
            answer = Double.parseDouble(tfNumber1.getText()) / Double.parseDouble(tfNumber2.getText());
            tfResult.setText(answer + "");
        });

        HBox operatorsPane = new HBox();
        operatorsPane.setSpacing(10);
        operatorsPane.setAlignment(Pos.CENTER);
        operatorsPane.getChildren().addAll(buttonAdd, buttonSubtract, buttonMultiply, buttonDivide);

        BorderPane borderPane = new BorderPane(numberPane);
        BorderPane.setMargin(numberPane, new Insets(10, 10, 10, 10));

        borderPane.setBottom(operatorsPane);
        BorderPane.setMargin(operatorsPane, new Insets(10, 10, 10, 10));
        primaryStage.setScene(new Scene(borderPane, borderPane.getPrefWidth(),borderPane.getPrefWidth()));
        primaryStage.setTitle("Simple calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}