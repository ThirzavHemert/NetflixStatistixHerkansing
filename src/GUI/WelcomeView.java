package GUI;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class WelcomeView {
    public Parent getView(){
        BorderPane borderPane = new BorderPane();

        Label welcomeMessage = new Label("Welcome to the NetflixStatistix Application of Sammy, Sylvester and Thirza");

        borderPane.setCenter(welcomeMessage);

        return borderPane;
    }
}
