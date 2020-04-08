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

public class AccountView {
    AddAccountView addAccountView = new AddAccountView();
//    EditAccountView editAccountView = new EditAccountView();

    public Parent getView(){
        //Creating main components
        VBox vBox = new VBox();
        TableView tableView = new TableView();
        HBox buttonBox = new HBox();

        //Creating title node
        Label title = new Label("Accounts Overview");

        //Creating table columns
        TableColumn id = new TableColumn("ID");
        TableColumn name = new TableColumn("Name");
        TableColumn street = new TableColumn("Street");
        TableColumn houseNr = new TableColumn("HouseNr");
        TableColumn zipCode = new TableColumn("ZipCode");
        TableColumn city = new TableColumn("City");

        tableView.getColumns().addAll(id, name, street, houseNr, zipCode, city);
        tableView.setMaxSize(600,300);

        //Creating buttons and add them to buttonBox
        Button addAccount = new Button("Add");
        Button editAccount = new Button("Edit");
        Button deleteAccount = new Button("Delete");

        buttonBox.getChildren().addAll(addAccount, editAccount, deleteAccount);

        //Setting Positions, Spacing and Padding
        title.setPadding(new Insets(10,0,10,230));
        title.setFont(Font.font("TimesRoman", FontWeight.BOLD, 15));
        buttonBox.setSpacing(10);
        buttonBox.setPadding(new Insets(10));

        //Adding components to BorderPane
        vBox.getChildren().addAll(title, tableView,buttonBox);

        addAccount.setOnAction((event)->{
            Stage addAccountStage = new Stage();
            addAccountStage.setMinWidth(300);
            addAccountStage.setMinHeight(300);
            addAccountStage.setTitle("Add Account");
            Scene scene = new Scene(addAccountView.getView());
            addAccountStage.setScene(scene);
            addAccountStage.show();
        });
//
//        editAccount.setOnAction((event)->{
//            Stage editAccountStage = new Stage();
//            editAccountStage.setMinHeight(300);
//            editAccountStage.setTitle("Edit Account");
//            editAccountStage.setMinWidth(300);
//            Scene scene = new Scene(editAccountView.getView());
//            editAccountStage.setScene(scene);
//            editAccountStage.show();
//        });



        return vBox;
    }
}
