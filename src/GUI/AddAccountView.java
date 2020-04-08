package GUI;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class AddAccountView {
    public Parent getView(){
        //Creating Main components
        BorderPane borderPane = new BorderPane();
        GridPane gridPane = new GridPane();
        HBox buttonBox = new HBox();

        //Creating textfields
        TextField tfID = new TextField();
        TextField tfName = new TextField();
        TextField tfStreet = new TextField();
        TextField tfHouseNr = new TextField();
        TextField tfZipCode = new TextField();
        TextField tfCity = new TextField();

        //Adding nodes to the gridpane
        gridPane.add(new Label("ID:"),0,0);
        gridPane.add(tfID,1,0);
        gridPane.add(new Label("Name:"),0,1);
        gridPane.add(tfName,1,1);
        gridPane.add(new Label("Street:"),0,2);
        gridPane.add(tfStreet,1,2);
        gridPane.add(new Label("House number:"),0,3);
        gridPane.add(tfHouseNr,1,3);
        gridPane.add(new Label("Zip code:"),0,4);
        gridPane.add(tfZipCode,1,4);
        gridPane.add(new Label("City"),0,5);
        gridPane.add(tfCity,1,5);

        //Creating buttons and adding them to buttonBox
        Button saveAccount = new Button("Save");
        Button cancelStage = new Button("Cancel");
        buttonBox.getChildren().addAll(saveAccount,cancelStage);

        //Setting spacing
        gridPane.setVgap(10);
        gridPane.setHgap(25);
        gridPane.setPadding(new Insets(20,10,20,10));
        buttonBox.setPadding(new Insets(10));
        buttonBox.setSpacing(10);

        //Add components to borderpane
        borderPane.setCenter(gridPane);
        borderPane.setBottom(buttonBox);

        return borderPane;
    }
}
