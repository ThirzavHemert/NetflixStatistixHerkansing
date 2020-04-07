package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NetflixGUI extends Application {
    @Override
    public void start(Stage stage){

        WelcomeView welcomeView = new WelcomeView();
        AccountView accountView = new AccountView();
        ProfileView profileView = new ProfileView();
        MovieView movieView = new MovieView();
        SerieView serieView = new SerieView();

        //Making components for the main Stage
        BorderPane borderPane = new BorderPane();
        VBox mainMenuBox = new VBox();
        mainMenuBox.setPadding(new Insets(25,25,25,5));
        mainMenuBox.setSpacing(10);

        // Making Buttons for the main menu
        Button homeButton = new Button("Home");
        Button accountButton = new Button("Accounts");
        Button profileButton = new Button("Profiles");
        Button movieButton = new Button("Movies");
        Button seriesButton = new Button("Series");

        // Setting size of the buttons
        homeButton.setPrefSize(70,10);
        accountButton.setPrefSize(70,10);
        profileButton.setPrefSize(70,10);
        movieButton.setPrefSize(70,10);
        seriesButton.setPrefSize(70,10);

        // Adding Buttons to the VBox
        mainMenuBox.getChildren().addAll(homeButton,accountButton,profileButton,movieButton,seriesButton);

        // Adding components to the BorderPane
        borderPane.setLeft(mainMenuBox);

        //Menu buttons functionality (Temporary)

        homeButton.setOnAction((event)->{
            borderPane.setCenter(welcomeView.getView());
            stage.setHeight(400);
        });

        accountButton.setOnAction((event)->{
            stage.setHeight(400);
            borderPane.setCenter(accountView.getView());
        });

        profileButton.setOnAction((event)->{
            borderPane.setCenter(profileView.getView());
            stage.setHeight(650);
        });

        movieButton.setOnAction((event)->{
            stage.setHeight(400);
            borderPane.setCenter(movieView.getView());
        });

        seriesButton.setOnAction((event)->{
            borderPane.setCenter(serieView.getView());
            stage.setHeight(400);
        });

        borderPane.setCenter(welcomeView.getView());

        Scene scene = new Scene(borderPane);
        stage.setMinHeight(400);
        stage.setMinWidth(750);
        stage.setScene(scene);
        stage.setTitle("NetflixStatistix");
        stage.show();
    }
}
