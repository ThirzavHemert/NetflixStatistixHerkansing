package model;

public class Movie extends Program{

    private String language;
    private String genre;
    private int ageIndication;

    public Movie(int id, String title, String duration, String genre, String language, int ageIndication){
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

    public int getAgeIndication() {
        return ageIndication;
    }

    public void setAgeIndication(int ageIndication) {
        this.ageIndication = ageIndication;
    }
}
