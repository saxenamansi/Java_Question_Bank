package javafxda;
import javafx.application.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;
public class AirTicketQues extends Application {
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Online Ticket Form Booking");
        GridPane gridPane = createRegistrationFormPane();
        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private GridPane createRegistrationFormPane(){
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(40, 40, 40, 40));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200, 200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return gridPane;
    }
    private void addUIControls(GridPane gridPane){
        Label headerLabel = new Label("Flight Ticket Booking Form");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));
        
        Label nameLabel = new Label("Source : ");
        gridPane.add(nameLabel, 0,1);
        TextField nameField = new TextField();
        nameField.setPrefHeight(40);
        nameField.setPrefWidth(300);
        gridPane.add(nameField, 1,1);
        
        Label emailLabel = new Label("Destination : ");
        gridPane.add(emailLabel, 0, 2);
        TextField emailField = new TextField();
        emailField.setPrefHeight(40);
        emailField.setPrefWidth(300);
        gridPane.add(emailField, 1, 2);
        
        Label d = new Label("Depature Date : ");
        gridPane.add(d, 0, 3);
        DatePicker date = new DatePicker();
        date.setPrefHeight(40);
        date.setPrefWidth(700);
        gridPane.add(date, 1, 3);
        
        Label pas = new Label("Number of Passengers : ");
        gridPane.add(pas, 0, 4);
        TextField pass = new TextField();
        emailField.setPrefHeight(40);
        emailField.setPrefWidth(300);
        gridPane.add(pass, 1, 4);
        
        Label c = new Label("Class : ");
        gridPane.add(c, 0, 5);
        String week_days[] = {"Business", "First", "Economy"};
        ComboBox combo_box = new
        ComboBox(FXCollections.observableArrayList(week_days));
        combo_box.setPrefHeight(40);
        combo_box.setPrefWidth(700);
        gridPane.add(combo_box, 1, 5);
        
        Button submitButton = new Button("Book");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        gridPane.add(submitButton, 0, 6, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));
        submitButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                if(nameField.getText().isEmpty()){
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),"Form Error!",
                            "Please enter the source field.");
                    return;
                } 
                if(emailField.getText().isEmpty()){ 
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),"Form Error!", 
                            "Please enter the destination field.");
                    return;
                } 
                if(date.getValue() == null){
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),"Form Error!", 
                            "Please enter the date of departure field.");
                    return;
                } 
                if(pass.getText().isEmpty()){
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),"Form Error!", 
                            "Please enter the no.of passengers field");
                    return;
                }
                if(combo_box.getValue() == null){
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),"Form Error!", 
                            "Please select a Class field");
                    return;
                }
                showAlert(Alert.AlertType.CONFIRMATION,gridPane.getScene().getWindow(), "Registration Successful!", 
                    "\nSource : " +  nameField.getText()+"\nDestination : " + emailField.getText()+ 
                    "\nDate : " + date.getValue()+"\nNumber Of Passengers : " + pass.getText()+"\nClass : " +
                    combo_box.getValue());
            }
        });
    }
    private void showAlert(Alert.AlertType alertType, Window owner, String title,String message){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
