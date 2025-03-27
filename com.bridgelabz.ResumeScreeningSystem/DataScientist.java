// DataScientist.java
public class DataScientist extends JobRole {
    public DataScientist(String candidateName, String skills, int experience) {
        super(candidateName, skills, experience);
    }

    @Override
    public String getJobRole() {
        return "Data Scientist";
    }
}
