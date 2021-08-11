package javafxda;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class ButtonQues extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        btn1.setText("Red");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String bgColor = "red";
                String bstyle = String.format("-fx-background-color: %s;", bgColor);
                btn1.setStyle(bstyle);
                System.out.println ("Red Button was clicked");
            }
        });      

        Button btn2 = new Button();
        btn2.setText("Green");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String bgColor = "green";
                String bstyle = String.format("-fx-background-color: %s;", bgColor);
                btn2.setStyle(bstyle);
                System.out.println("Green Button was clicked");
            }
        });
        Button btn3 = new Button();
        btn3.setText("Blue");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String bgColor = "blue";
                String bstyle = String.format("-fx-background-color: %s;", bgColor);
                btn3.setStyle(bstyle);
                System.out.println("Blue Button was clicked");
            }
        });
        Button btn4 = new Button();
        btn4.setText("Pink");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String bgColor = "pink";
                String bstyle = String.format("-fx-background-color: %s;", bgColor);
                btn4.setStyle(bstyle);
                System.out.println("Pink Button was clicked");
            }
        });
        Button btn5 = new Button();
        btn5.setText("Black");
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String bgColor = "black";
                String bstyle = String.format("-fx-background-color: %s;", bgColor);
                btn5.setStyle(bstyle);
                System.out.println("Black Button was clicked");
            }
        });
        HBox root = new HBox(5);
        root.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
   public static void main(String[] args) {
       launch(args);
   }
}

