package Database.DAO;

import Database.DatabaseConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Account;
import model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MovieDAO {
    private DatabaseConnection dbConnection;
    private static MovieDAO instance;

    private MovieDAO(){

    }

    public static MovieDAO getInstance() {
        if (instance == null) {
            instance = new MovieDAO();
        }
        return instance;
    }

    public ObservableList<Movie> getAllMovies(){
        Connection conn = null;
        ObservableList<Movie> movieList = FXCollections.observableArrayList();

        try{
            conn = dbConnection.getInstance().connect();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Movie \n" +
                    "INNER JOIN Program ON Movie.videoID = Program.programID");
            ResultSet resultSet = stmt.executeQuery();

            while(resultSet.next()){
                int id = resultSet.getInt("programID");
                String title = resultSet.getString("programTitle");
                String duration = resultSet.getString("programDuration");
                String genre = resultSet.getString("genre");
                String language = resultSet.getString("language");
                String ageIndication = resultSet.getString("ageIndication");

                Movie m = new Movie(id, title, duration, genre, language, ageIndication);
                movieList.add(m);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return movieList;
    }
}
