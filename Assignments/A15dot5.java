import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A15dot5 extends Application {
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();

	public static void main(String[] args) {
		Application.launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setVgap(5);
		pane.setHgap(5);
		pane.getStyleClass().add("grid-pane");
		pane.getStylesheets().add("InvestmentCalculator.css");
		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setTitle("Investment Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		pane.add(new Label("Investment Amount"), 0, 0);
		pane.add(tfInvestmentAmount, 1, 0);
		pane.add(new Label("Number Of Years"), 0, 1);
		pane.add(tfNumberOfYears, 1, 1);
		pane.add(new Label("Annual Interest Rate"), 0, 2);
		pane.add(tfAnnualInterestRate, 1, 2);
		pane.add(new Label("Future Value"), 0, 3);
		pane.add(tfFutureValue, 1, 3);
		tfFutureValue.setEditable(false);
		Button btCalc = new Button("Calculate");
		btCalc.setMinWidth(185);
		btCalc.setOnAction(e -> calculateValue());
		pane.add(btCalc, 0, 4);
		Button btReset = new Button("Reset");
		btReset.setMinWidth(185);
		btReset.setOnAction(e -> resetForm());
		pane.add(btReset, 1, 4);
	}

	private void calculateValue() {
		try {
			double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
			double years = Double.parseDouble(tfNumberOfYears.getText());
			double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText());
			double monthlyRate = Double.parseDouble(tfR.getText());
			double monthlyInterestRate = annualInterestRate / 1200.0;
			double futureValue = investmentAmount * Math.pow(1.0 + monthlyInterestRate, years * 12.0);
			tfFutureValue.setText(String.format("$%.2f", futureValue));
		} catch (NumberFormatException e) {
			tfFutureValue.setText("Please enter numbers");
		}
	}

	private void resetForm() {
		tfInvestmentAmount.clear();
		tfNumberOfYears.clear();
		tfAnnualInterestRate.clear();
		tfFutureValue.clear();
	}
}