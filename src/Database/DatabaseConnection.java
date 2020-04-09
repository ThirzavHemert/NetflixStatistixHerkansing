package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private final String connectionUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=NetflixStatistix;integratedSecurity=true;";
    private static Connection con = null;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            return new DatabaseConnection();
        } else {
            return instance;
        }
    }

    private DatabaseConnection(){

    }

    public Connection connect() {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager
                    .getConnection(connectionUrl);
            return connection;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

//    public DatabaseConnection() {
//        try {
//            // 'Importeer' de driver die je gedownload hebt.
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            // Maak de verbinding met de database.
//            con = DriverManager.getConnection(connectionUrl);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static Connection getCon() {
        return con;
    }
}
