
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaGUI extends Application {

    public void start(Stage primaryStage) {


        primaryStage.setTitle("Number Finder");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new

        Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 300, 275);

        Text scenetitle = new Text("Input NUmbers");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        Label EnterFirstNumber = new Label("Enter first number");
        grid.add(EnterFirstNumber, 0, 1);
        Label EnterSecondNumber = new Label("Enter second number");
        grid.add(EnterSecondNumber, 0, 2);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        TextField userTextField1 = new TextField();
        grid.add(userTextField1, 1, 2);

        Button btn = new Button("Find Total");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().

        add(btn);
        grid.add(hbBtn, 1, 3);

        primaryStage.setScene(scene);
        primaryStage.show();


        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            int number1 = Integer.parseInt(userTextField.getText());
            int number2 = Integer.parseInt(userTextField1.getText());

            int sum = number1+number2;



                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("The total of the two numbers is " + sum);

                alert.showAndWait();
                System.exit(0);


            }
        });

    }
}
