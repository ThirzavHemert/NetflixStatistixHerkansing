package GUI;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ProfileView {
//    AddProfileView addProfileView = new AddProfileView();
//    AddWatchedProgram addWatchedProgramView = new AddWatchedProgram();

    public Parent getView(){
        //Creating main components
        BorderPane wrapper = new BorderPane();
        VBox pfOverview = new VBox();
        BorderPane programsWatched = new BorderPane();
        Label viewTitle = new Label("Profile Overview");
        Label watchedTitle = new Label("Programs Watched");

        //Setting up pfOverview components
        VBox vBox = new VBox();
        ComboBox accountList = new ComboBox();
        TableView profileTable = new TableView();
        HBox buttonBox = new HBox();

        //Setting up vBox
//        accountList.getItems().addAll(){
//            load up accounts
//        }
        vBox.getChildren().addAll(viewTitle, accountList);

        //Creating profile table columns and adding them to table view
        TableColumn pfId = new TableColumn("ID");
        TableColumn pfAccountID = new TableColumn("Account ID");
        TableColumn pfName = new TableColumn("Name");
        TableColumn pfDateOfBirth = new TableColumn("Dat of Birth");

        profileTable.getColumns().addAll(pfId, pfAccountID, pfName, pfDateOfBirth);
        profileTable.setMaxSize(600,200);

        //Creating buttons and adding them to buttonBox
        Button addProfile = new Button("Add");
        Button deleteProfile = new Button("Delete");
        Button editProfile = new Button("Edit");
        buttonBox.getChildren().addAll(addProfile, editProfile, deleteProfile);

        //Setting up programsWatched components
        TableView watchedTable = new TableView();
        HBox buttonBoxWatched = new HBox();

        //Creating table with programs watched
        TableColumn wId = new TableColumn("ID");
        TableColumn wTitle = new TableColumn("Title");
        TableColumn wPercWatched = new TableColumn("Percentage Watched");
        watchedTable.getColumns().addAll(wId,wTitle, wPercWatched);
        watchedTable.setMaxSize(600,200);

        //Creating buttons and adding them to buttonBoxWatched
        Button addWatched = new Button("Add");
        Button editWatched = new Button("Edit");
        buttonBoxWatched.getChildren().addAll(addWatched,editWatched);

        //Adding components to programsWatched borderpane
        programsWatched.setCenter(watchedTable);
        programsWatched.setBottom(buttonBoxWatched);

        //Adding components to pfOverview borderpane
        pfOverview.getChildren().addAll(vBox, profileTable, buttonBox, watchedTitle, watchedTable, buttonBoxWatched);

        //Setting Padding and spacing
        buttonBox.setPadding(new Insets(10));
        buttonBoxWatched.setPadding(new Insets(10));
        buttonBox.setSpacing(10);
        buttonBoxWatched.setSpacing(10);
        viewTitle.setPadding(new Insets(10,0,10,230));
        viewTitle.setFont(Font.font("TimesRoman", FontWeight.BOLD, 15));
        watchedTitle.setPadding(new Insets(10,0,10,230));
        watchedTitle.setFont(Font.font("TimesRoman", FontWeight.BOLD, 15));

        //Adding borderpanes to wrapper
        wrapper.setTop(pfOverview);
        wrapper.setBottom(programsWatched);

        //Functionality buttons
//        addProfile.setOnAction((event)->{
//            Stage addProfileStage = new Stage();
//            addProfileStage.setHeight(300);
//            addProfileStage.setWidth(300);
//            addProfileStage.setTitle("Add Profile");
//            Scene scene = new Scene(addProfileView.getView());
//            addProfileStage.setScene(scene);
//            addProfileStage.show();
//        });
//
//        addWatched.setOnAction((event)->{
//            Stage addWatchedStage = new Stage();
//            addWatchedStage.setHeight(280);
//            addWatchedStage.setWidth(340);
//            addWatchedStage.setTitle("Add Watched Program");
//            Scene scene = new Scene(addWatchedProgramView.getView());
//            addWatchedStage.setScene(scene);
//            addWatchedStage.show();
//        });

        return wrapper;
    }
}
