package Database.DAO;

import Database.DatabaseConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
    private DatabaseConnection dbConnection;
    private static AccountDAO instance;

    private AccountDAO(){

    }

    public static AccountDAO getInstance() {
        if (instance == null) {
            instance = new AccountDAO();
        }
        return instance;
    }

    public ObservableList<Account> getAllAccounts(){
        Connection conn = null;
//        ArrayList<Account> accountList = new ArrayList<>();
        ObservableList<Account> accountList = FXCollections.observableArrayList();

        try{
            conn = dbConnection.getInstance().connect();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Account");
            ResultSet resultSet = stmt.executeQuery();

            while(resultSet.next()){
                int accountID = resultSet.getInt("accountID");
                String accountName = resultSet.getString("accountName");
                String streetName = resultSet.getString("streetName");
                String houseNr = resultSet.getString("houseNr");
                String zipCode = resultSet.getString("zipCode");
                String residence = resultSet.getString("residence");

                Account account = new Account(accountID, accountName, streetName, houseNr, zipCode, residence);
                accountList.add(account);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return accountList;
    }

//    public ArrayList<Account> getAllAccounts(){
//        Connection conn = null;
//        ArrayList<Account> accountList = new ArrayList<>();
//
//        try{
//            conn = dbConnection.getCon();
//            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Account");
//            ResultSet resultSet = stmt.executeQuery();
//
//            while(resultSet.next()){
//                int accountID = resultSet.getInt("accountID");
//                String accountName = resultSet.getString("accountName");
//                String streetName = resultSet.getString("streetName");
//                String houseNr = resultSet.getString("houseNr");
//                String zipCode = resultSet.getString("zipCode");
//                String residence = resultSet.getString("residence");
//
//                Account account = new Account(accountID, accountName, streetName, houseNr, zipCode, residence);
//                accountList.add(account);
//            }
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//        return accountList;
//    }
}
