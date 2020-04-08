package GUI;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class AddMovieView {
    public Parent getView(){
        //Creating main components
        BorderPane borderPane = new BorderPane();
        GridPane gridPane = new GridPane();
        HBox buttonBox = new HBox();

        //Creating Textfields
        TextField id = new TextField("");
        TextField title = new TextField("");
        TextField duration = new TextField("");
        TextField genre = new TextField("");
        TextField language = new TextField("");
        TextField age = new TextField("");

        //Creating Buttons and adding them to buttonBox
        Button saveMovie = new Button("Save");
        Button cancel = new Button("Cancel");
        buttonBox.getChildren().addAll(saveMovie, cancel);

        //Creating the gridpane
        gridPane.add(new Label("ID:"),0,0);
        gridPane.add(id,1,0);
        gridPane.add(new Label("Title:"),0,1);
        gridPane.add(title,1,1);
        gridPane.add(new Label("Duration:"),0,2);
        gridPane.add(duration,1,2);
        gridPane.add(new Label("Genre:"),0,3);
        gridPane.add(genre,1,3);
        gridPane.add(new Label("Language:"),0,4);
        gridPane.add(language,1,4);
        gridPane.add(new Label("Age:"),0,5);
        gridPane.add(age,1,5);

        //Setting spacing
        buttonBox.setSpacing(10);
        buttonBox.setPadding(new Insets(10));
        gridPane.setPadding(new Insets(20,10,20,10));
        gridPane.setHgap(25);
        gridPane.setVgap(10);

        //Adding components to borderpane
        borderPane.setCenter(gridPane);
        borderPane.setBottom(buttonBox);


        return borderPane;
    }
}
