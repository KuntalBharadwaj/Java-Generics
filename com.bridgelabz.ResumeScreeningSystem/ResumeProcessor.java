// ResumeProcessor.java
import java.util.List;

public class ResumeProcessor {
    public static void processResumes(List<? extends JobRole> resumes) {
        System.out.println("\n=== Processing Resumes ===");
        for (JobRole resume : resumes) {
            System.out.println("Reviewing Resume: " + resume);
            evaluateCandidate(resume);
        }
    }

    private static void evaluateCandidate(JobRole candidate) {
        if (candidate.experience >= 3) {
            System.out.println("✅ " + candidate.candidateName + " is shortlisted for " + candidate.getJobRole());
        } else {
            System.out.println("❌ " + candidate.candidateName + " needs more experience for " + candidate.getJobRole());
        }
    }
}
