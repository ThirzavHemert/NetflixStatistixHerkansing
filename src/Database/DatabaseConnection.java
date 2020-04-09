package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private final String connectionUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=NetflixStatistix;integratedSecurity=true;";
    private Connection con = null;

    public DatabaseConnection() {
        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getCon() {
        return con;
    }
}
