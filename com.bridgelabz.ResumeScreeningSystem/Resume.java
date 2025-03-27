// Resume.java
import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    private List<T> resumes;

    public Resume() {
        this.resumes = new ArrayList<>();
    }

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }

    public void displayResumes() {
        for (T resume : resumes) {
            System.out.println(resume);
        }
    }
}
