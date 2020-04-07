package model;

import java.util.Date;

public class Profile {
    private String profileName;
    private Date dateOfBirth;
    private int accountID;
    private int profileID;

    public Profile(String profileName, Date dateOfBirth, int profileID, int accountID){
        this.profileName = profileName;
        this.dateOfBirth = dateOfBirth;
        this.profileID = profileID;
        this.accountID = accountID;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }
}
