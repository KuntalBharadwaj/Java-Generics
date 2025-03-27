// ResumeScreeningSystem.java
import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Create Resume Lists for different roles
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        Resume<DataScientist> dataScientistResumes = new Resume<>();
        Resume<ProductManager> productManagerResumes = new Resume<>();

        // Add resumes for different roles
        softwareEngineerResumes.addResume(new SoftwareEngineer("Alice", "Java, Spring Boot, SQL", 4));
        softwareEngineerResumes.addResume(new SoftwareEngineer("Bob", "JavaScript, React, Node.js", 2));

        dataScientistResumes.addResume(new DataScientist("Charlie", "Python, TensorFlow, SQL", 5));
        dataScientistResumes.addResume(new DataScientist("David", "R, Machine Learning, Statistics", 1));

        productManagerResumes.addResume(new ProductManager("Eve", "Agile, Business Strategy", 6));
        productManagerResumes.addResume(new ProductManager("Frank", "User Research, A/B Testing", 2));

        // Display resumes
        System.out.println("Software Engineer Resumes:");
        softwareEngineerResumes.displayResumes();

        System.out.println("\nData Scientist Resumes:");
        dataScientistResumes.displayResumes();

        System.out.println("\nProduct Manager Resumes:");
        productManagerResumes.displayResumes();

        // Process all resumes together using wildcards
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.addAll(softwareEngineerResumes.getResumes());
        allResumes.addAll(dataScientistResumes.getResumes());
        allResumes.addAll(productManagerResumes.getResumes());

        ResumeProcessor.processResumes(allResumes);
    }
}


// Software Engineer Resumes:
// Candidate: Alice, Role: Software Engineer, Skills: Java, Spring Boot, SQL, Experience: 4 years
// Candidate: Bob, Role: Software Engineer, Skills: JavaScript, React, Node.js, Experience: 2 years

// Data Scientist Resumes:
// Candidate: Charlie, Role: Data Scientist, Skills: Python, TensorFlow, SQL, Experience: 5 years
// Candidate: David, Role: Data Scientist, Skills: R, Machine Learning, Statistics, Experience: 1 years

// Product Manager Resumes:
// Candidate: Eve, Role: Product Manager, Skills: Agile, Business Strategy, Experience: 6 years
// Candidate: Frank, Role: Product Manager, Skills: User Research, A/B Testing, Experience: 2 years

// === Processing Resumes ===
// Reviewing Resume: Candidate: Alice, Role: Software Engineer, Skills: Java, Spring Boot, SQL, Experience: 4 years
// ? Alice is shortlisted for Software Engineer
// Reviewing Resume: Candidate: Bob, Role: Software Engineer, Skills: JavaScript, React, Node.js, Experience: 2 years
// ? Bob needs more experience for Software Engineer
// Reviewing Resume: Candidate: Charlie, Role: Data Scientist, Skills: Python, TensorFlow, SQL, Experience: 5 years
// ? Charlie is shortlisted for Data Scientist
// Reviewing Resume: Candidate: David, Role: Data Scientist, Skills: R, Machine Learning, Statistics, Experience: 1 years
// ? David needs more experience for Data Scientist
// Reviewing Resume: Candidate: Eve, Role: Product Manager, Skills: Agile, Business Strategy, Experience: 6 years
// ? Eve is shortlisted for Product Manager
// Reviewing Resume: Candidate: Frank, Role: Product Manager, Skills: User Research, A/B Testing, Experience: 2 years
// ? Frank needs more experience for Product Manager