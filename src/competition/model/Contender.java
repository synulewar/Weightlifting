package competition.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

public class Contender implements Serializable {

    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty nationality;
    private final SimpleStringProperty club;
    private final SimpleDoubleProperty weight;
    private final SimpleIntegerProperty bornYear;
    private final SimpleIntegerProperty entrySnatch;
    private final SimpleIntegerProperty entryCleanJerk;
    private final SimpleIntegerProperty entryTotal;

    private String mLicenseNumber;
    private double mSinclairFactor;
    private Lift mSnatch;
    private Lift mCleanJerk;
    private Sex mSex = Sex.MEN; //default
    private int mTotal;
    private double mExtraPoints = 0;
    private double mExtraFactor = 1;
    private double mTotalScoreSinclare;

    public Contender() {
        this.firstName = new SimpleStringProperty("");
        this.lastName = new SimpleStringProperty("");
        this.bornYear = new SimpleIntegerProperty(0);
        this.weight = new SimpleDoubleProperty(0);
        this.nationality = new SimpleStringProperty("");
        this.club =  new SimpleStringProperty("");
        this.entrySnatch = new SimpleIntegerProperty(0);
        this.entryCleanJerk = new SimpleIntegerProperty(0);
        this.entryTotal = new SimpleIntegerProperty(0);
        mSnatch = new Lift();
        mCleanJerk = new Lift();
    }

    public Contender(String firstName, String lastName, int bornYear, double weight, String nationality, String club,
                     int entrySnatch, int entryCleanJerk ) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.bornYear = new SimpleIntegerProperty(bornYear);
        this.weight = new SimpleDoubleProperty(weight);
        this.nationality = new SimpleStringProperty(nationality);
        this.club =  new SimpleStringProperty(club);
        this.entrySnatch = new SimpleIntegerProperty(entrySnatch);
        this.entryCleanJerk = new SimpleIntegerProperty(entryCleanJerk);
        this.entryTotal = new SimpleIntegerProperty(0);
        mSnatch = new Lift();
        mCleanJerk = new Lift();
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lasttName) {
        this.lastName.set(lasttName);
    }

    public String getNationality() {
        return nationality.get();
    }

    public String getClub() {
        return club.get();
    }

    public String getLicenseNumber() {
        return mLicenseNumber;
    }

    public double getWeight() {
        return weight.get();
    }

    public int getBornYear() {
        return bornYear.get();
    }

    public double getSinclairFactor() {
        return mSinclairFactor;
    }

    public int getEntryTotal() {
        return entryTotal.get();
    }

    public Lift getSnatch() {
        return mSnatch;
    }

    public Lift getCleanJerk() {
        return mCleanJerk;
    }



    public void setNationality(String nationality) {
        this.nationality.set(nationality);
    }

    public void setClub(String club) {
        this.club.set(club);
    }

    public void setLicenseNumber(String licenseNumber) {
        this.mLicenseNumber = mLicenseNumber;
    }

    public void setWeight(double weight) {
        this.weight.set(weight);
    }

    public void setBornYear(int yearOfBirth) {
        this.bornYear.set(yearOfBirth);
    }

    public void setSinclairFactor(double sinclairFactor) {
        this.mSinclairFactor = sinclairFactor;
    }

    public void setEntryTotal(int entryTotal) {
        this.entryTotal.set(entryTotal);
    }

    public void setSnatch(Lift snatch) {
        this.mSnatch = mSnatch;
    }

    public void setCleanJerk(Lift cleanJerk) {
        this.mCleanJerk = mCleanJerk;
    }

    public Sex getSex() {
        return mSex;
    }

    public void setSex(Sex sex) {
        this.mSex = sex;
    }

    public void setTotal() {
        mTotal = mSnatch.getBestAttemp() + mCleanJerk.getBestAttemp();
    }

    public int getTotal() {
        return mTotal;
    }

    public void calculateSinclairFactor() {
        this.mSinclairFactor = Sinclair.getSinclairFactor(mSex, getWeight());
    }

    public void setExtraPoints(double extra) {
        this.mExtraPoints = extra;
    }

    public double getExtraPoints() {
        return mExtraPoints;
    }

    public void setExtraFactor(double extraFactor) {
        this.mExtraFactor = extraFactor;
    }

    public double getExtraFactor() {
        return mExtraFactor;
    }

    public int getEntrySnatch() {
        return entrySnatch.get();
    }

    public int getEntryCleanJerk() {
        return entryCleanJerk.get();
    }

    public void setEntrySnatch(int entrySnatch) {
        this.entrySnatch.set(entrySnatch);
    }

    public void setEntryCleanJerk(int entryCleanJerk) {
        this.entryCleanJerk.set(entryCleanJerk);
    }

    public void calculateScoreSinclair() {
        mTotalScoreSinclare = mExtraFactor *  mTotal * mSinclairFactor + mExtraPoints;
    }

    public double getTotalScoreSinclare() {
        return mTotalScoreSinclare;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + entryTotal;
    }
}
