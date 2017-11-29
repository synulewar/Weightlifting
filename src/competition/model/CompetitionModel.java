package competition.model;

import java.util.ArrayList;
import java.util.Date;

public class CompetitionModel {

    String mCompetitionName;
    String mGroupName;
    Date mDate;
    ArrayList<Contender> mConstenders = new ArrayList<>();
    ArrayList<Referee> mReferees = new ArrayList<>();

    public String getCompetitionName() {
        return mCompetitionName;
    }

    public String getGroupName() {
        return mGroupName;
    }

    public Date getDate() {
        return mDate;
    }

    public ArrayList<Contender> getConstenders() {
        return mConstenders;
    }

    public ArrayList<Referee> getReferees() {
        return mReferees;
    }

    public void setCompetitionName(String competitionName) {
        this.mCompetitionName = competitionName;
    }

    public void setGroupName(String groupName) {
        this.mGroupName = groupName;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public void addContender(Contender contender) {
        mConstenders.add(contender);
    }

    public void removeContander(Contender contender) {
        mConstenders.remove(contender);
    }

    public void addReferee(Referee referee) {
        mReferees.add(referee);
    }

    public void removeReferee(Referee referee) {
        mReferees.remove(referee);
    }

    public void setContenders(ArrayList constenders) {
        this.mConstenders = constenders;
    }

    public void setReferees(ArrayList referees) {
        this.mReferees = referees;
    }
}
