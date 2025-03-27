// JobRole.java
public abstract class JobRole {
    protected String candidateName;
    protected String skills;
    protected int experience; // Years of experience

    public JobRole(String candidateName, String skills, int experience) {
        this.candidateName = candidateName;
        this.skills = skills;
        this.experience = experience;
    }

    public abstract String getJobRole();

    @Override
    public String toString() {
        return "Candidate: " + candidateName + ", Role: " + getJobRole() + 
               ", Skills: " + skills + ", Experience: " + experience + " years";
    }
}
