package GUI;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class AddProfileView {
    public Parent getView(){
        //Creating main components
        HBox buttonBox = new HBox();
        BorderPane borderPane = new BorderPane();
        GridPane gridPane = new GridPane();


        //Creating textfields
        TextField tfID = new TextField();
        TextField tfAccountID = new TextField();
        TextField tfName = new TextField();
        TextField tfDateOfBirth = new TextField();

        //Creating buttons and adding them to buttonBox
        Button cancel = new Button("Cancel");
        Button saveProfile = new Button("Save");
        buttonBox.getChildren().addAll(saveProfile,cancel);

        //Creating the gridpane
        gridPane.add(new Label("ID"),0,0);
        gridPane.add(tfID,1,0);
        gridPane.add(new Label("Account ID"),0,1);
        gridPane.add(tfAccountID,1,1);
        gridPane.add(new Label("Name"),0,2);
        gridPane.add(tfName,1,2);
        gridPane.add(new Label("Date of Birth"),0,3);
        gridPane.add(tfDateOfBirth,1,3);

        //Setting spacing and Padding
        buttonBox.setPadding(new Insets(10));
        gridPane.setPadding(new Insets(20,10,20,10));
        gridPane.setVgap(10);
        gridPane.setHgap(25);
        buttonBox.setSpacing(10);

        //Adding ccomponents to borderpane
        borderPane.setCenter(gridPane);
        borderPane.setBottom(buttonBox);

        return borderPane;
    }
}
