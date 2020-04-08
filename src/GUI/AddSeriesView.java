package GUI;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class AddSeriesView {
    public Parent getView(){
        //Creating main components
        BorderPane borderPane = new BorderPane();
        HBox buttonBox = new HBox();
        GridPane gridPane = new GridPane();

        //Creating Textfields
        TextField id = new TextField();
        TextField title = new TextField();
        TextField duration = new TextField();
        TextField season = new TextField();

        //Creating buttons and adding them to buttonBox
        Button saveSeries = new Button("Save");
        Button cancel = new Button("Cancel");
        buttonBox.getChildren().addAll(saveSeries, cancel);

        //Creating gridpane
        gridPane.add(new Label("ID"),0,0);
        gridPane.add(id,1,0);
        gridPane.add(new Label("Title"),0,1);
        gridPane.add(title,1,1);
        gridPane.add(new Label("Duration"),0,2);
        gridPane.add(duration,1,2);
        gridPane.add(new Label("Season"),0,3);
        gridPane.add(season,1,3);

        //Setting padding and spacing
        gridPane.setHgap(25);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20,10,20,10));
        buttonBox.setSpacing(10);
        buttonBox.setPadding(new Insets(10));

        //Adding components to borderpane
        borderPane.setCenter(gridPane);
        borderPane.setBottom(buttonBox);

        return borderPane;
    }
}
