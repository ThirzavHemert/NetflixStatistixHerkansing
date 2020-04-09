package Database.DAO;

import Database.DatabaseConnection;
import model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
    private DatabaseConnection dbConnection;

    public AccountDAO(DatabaseConnection dbConnection){
        this.dbConnection = dbConnection;
    }

    public List<Account> getAllAccounts(){
        Connection conn = null;
        ArrayList<Account> accountList = new ArrayList<>();

        try{
            PreparedStatement stmt = dbConnection.getCon().prepareStatement("SELECT * FROM Account");
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
}
