package GUI;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MovieView {
    AddMovieView addMovieView = new AddMovieView();

    public Parent getView(){
        //Creating Main components
        VBox vBox = new VBox();
        TableView movieTable = new TableView();
        HBox buttonBox = new HBox();
        Label viewTitle = new Label("Movie Overview");

        //Creating table columns
        TableColumn id = new TableColumn("ID");
        TableColumn title = new TableColumn("Title");
        TableColumn duration = new TableColumn("Duration");
        TableColumn genre = new TableColumn("Genre");
        TableColumn language = new TableColumn("Language");
        TableColumn age = new TableColumn("Age");

        movieTable.getColumns().addAll(id, title, duration, genre, language, age);
        movieTable.setMaxSize(600,300);

        //Creating buttons and adding them to buttonBox
        Button addMovie = new Button("Add");
        Button deleteMovie = new Button("Delete");
        buttonBox.getChildren().addAll(addMovie, deleteMovie);

        //Setting spacing and padding
        buttonBox.setPadding(new Insets(10));
        buttonBox.setSpacing(10);
        viewTitle.setPadding(new Insets(10,0,10,230));
        viewTitle.setFont(Font.font("TimesRoman", FontWeight.BOLD, 15));

        //Adding components to borderpane
        vBox.getChildren().addAll(viewTitle, movieTable, buttonBox);

        //AddMovie Button functionality
        addMovie.setOnAction((event)->{
            Stage addMovieStage = new Stage();
            addMovieStage.setMinHeight(300);
            addMovieStage.setMinWidth(300);
            addMovieStage.setTitle("Add Movie");

            Scene scene = new Scene(addMovieView.getView());
            addMovieStage.setScene(scene);
            addMovieStage.show();
        });

        return vBox;
    }
}
