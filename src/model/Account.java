package model;

public class Account {
    private int accountID;
    private String accountName;
    private String residence;
    private String streetName;
    private String houseNr;
    private String zipCode;

    public Account(int accountID, String accountName, String residence, String streetName, String houseNr, String zipCode){
        this.accountID = accountID;
        this.accountName = accountName;
        this.residence = residence;
        this.streetName = streetName;
        this.houseNr = houseNr;
        this.zipCode = zipCode;
    }

    public Account(){}

    @Override
    public String toString() {
        return this.accountName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
