package competition.model;

public class Referee {

    private String mFirstName;
    private String mLastName;
    private String mRank;
    private String mCity;

    public Referee() {}

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public String getRank() {
        return mRank;
    }

    public String getCity() {
        return mCity;
    }

    public void setFirstName(String firstName) {
        this.mFirstName = firstName;
    }

    public void setLastName(String lastName) {
        this.mLastName = lastName;
    }

    public void setRank(String rank) {
        this.mRank = rank;
    }

    public void setCity(String city) {
        this.mCity = city;
    }
}
