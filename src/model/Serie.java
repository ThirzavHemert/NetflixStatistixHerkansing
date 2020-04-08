package model;

public class Serie {
    private int id;
    private String serieName;
    private int ageIndication;
    private String language;
    private String genre;
    private String similar;

    public Serie(int id, String serieName, int ageIndication, String language, String genre, String similar){
        this.id = id;
        this.serieName = serieName;
        this.ageIndication = ageIndication;
        this.language = language;
        this.genre = genre;
        this.similar = similar;
    }

    public Serie(int id, String serieName, int ageIndication, String language, String genre){
        this.id = id;
        this.serieName = serieName;
        this.ageIndication = ageIndication;
        this.language = language;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerieName() {
        return serieName;
    }

    public void setSerieName(String serieName) {
        this.serieName = serieName;
    }

    public int getAgeIndication() {
        return ageIndication;
    }

    public void setAgeIndication(int ageIndication) {
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

    public String getSimilar() {
        return similar;
    }

    public void setSimilar(String similar) {
        this.similar = similar;
    }
}
