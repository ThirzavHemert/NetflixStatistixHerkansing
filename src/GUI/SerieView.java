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

public class SerieView {

//    AddSeriesView addSeriesView = new AddSeriesView();

    public Parent getView(){
        //Creating main components
        VBox vBox = new VBox();
        TableView serieTable = new TableView();
        HBox buttonBox = new HBox();
        Label viewTitle = new Label("Series Overview");

        //Creating table columns
        TableColumn id = new TableColumn("ID");
        TableColumn title = new TableColumn("Title");
        TableColumn duration = new TableColumn("Duration");
        TableColumn season = new TableColumn("Season");

        serieTable.setMaxSize(600,300);
        serieTable.getColumns().addAll(id, title, duration, season);

        //Creating buttons and adding them to buttonBox
        Button addSerie = new Button("Add");
        Button deleteSerie = new Button("Delete");
        buttonBox.getChildren().addAll(addSerie, deleteSerie);

        //Setting spacing and padding
        viewTitle.setFont(Font.font("TimesRoman", FontWeight.BOLD, 15));
        viewTitle.setPadding(new Insets(10,0,10,230));
        buttonBox.setPadding(new Insets(10));
        buttonBox.setSpacing(10);

        //Adding components to borderPane
        vBox.getChildren().addAll(viewTitle, serieTable, buttonBox);

        //AddSerie functionality
//        addSerie.setOnAction((event)->{
//            Stage addSerieStage = new Stage();
//            addSerieStage.setMinHeight(300);
//            addSerieStage.setMinWidth(300);
//            addSerieStage.setTitle("Add Series");
//
//            Scene scene = new Scene(addSeriesView.getView());
//            addSerieStage.setScene(scene);
//            addSerieStage.show();
//        });

        return vBox;
    }
}
