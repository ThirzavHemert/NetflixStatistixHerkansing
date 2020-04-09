package model;

public class Movie extends Program{

    private String language;
    private String genre;
    private String ageIndication;

    public Movie(int id, String title, String duration, String genre, String language, String ageIndication){
        super(id, title, duration);
        this.genre = genre;
        this.language = language;
        this.ageIndication = ageIndication;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAgeIndication() {
        return ageIndication;
    }

    public void setAgeIndication(String ageIndication) {
        this.ageIndication = ageIndication;
    }
}
