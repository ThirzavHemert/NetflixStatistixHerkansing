package GUI;

import Database.DAO.AccountDAO;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountView {
    AddAccountView addAccountView = new AddAccountView();

//    EditAccountView editAccountView = new EditAccountView();

    public Parent getView(){
        //Creating main components
        VBox vBox = new VBox();
        TableView<Account> tableView;
        HBox buttonBox = new HBox();

        //Creating title node
        Label title = new Label("Accounts Overview");

        //Creating table columns

        TableColumn<Account, Integer> idCol = new TableColumn<>("ID");
        idCol.setMinWidth(50);
        idCol.setCellValueFactory(new PropertyValueFactory<>("accountID"));

        TableColumn<Account, String> nameCol = new TableColumn<>("Name");
        nameCol.setMinWidth(50);
        nameCol.setCellValueFactory(new PropertyValueFactory<>("accountName"));

        TableColumn<Account, String> streetCol = new TableColumn<>("Street");
        streetCol.setMinWidth(50);
        streetCol.setCellValueFactory(new PropertyValueFactory<>("streetName"));

        TableColumn<Account, String> houseNrCol = new TableColumn<>("HouseNr");
        houseNrCol.setMinWidth(50);
        houseNrCol.setCellValueFactory(new PropertyValueFactory<>("houseNr"));

        TableColumn<Account, String> zipCodeCol = new TableColumn<>("ZipCode");
        zipCodeCol.setMinWidth(50);
        zipCodeCol.setCellValueFactory(new PropertyValueFactory<>("zipCode"));

        TableColumn<Account, String> cityCol = new TableColumn<>("Residence");
        cityCol.setMinWidth(50);
        cityCol.setCellValueFactory(new PropertyValueFactory<>("residence"));

        tableView = new TableView<>();
        tableView.setItems(AccountDAO.getInstance().getAllAccounts());
        tableView.getColumns().addAll(idCol, nameCol, streetCol, houseNrCol, zipCodeCol, cityCol);


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
