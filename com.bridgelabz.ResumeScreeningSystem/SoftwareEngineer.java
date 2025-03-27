// SoftwareEngineer.java
public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String skills, int experience) {
        super(candidateName, skills, experience);
    }

    @Override
    public String getJobRole() {
        return "Software Engineer";
    }
}
