// UniversitySystem.java
import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {
    public static void main(String[] args) {
        // Create different course categories
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Add courses to each category
        examCourses.addCourse(new ExamCourse("Mathematics 101", "Science"));
        examCourses.addCourse(new ExamCourse("Physics 201", "Engineering"));

        assignmentCourses.addCourse(new AssignmentCourse("Creative Writing", "Arts"));
        assignmentCourses.addCourse(new AssignmentCourse("Software Development", "Computer Science"));

        researchCourses.addCourse(new ResearchCourse("Quantum Computing", "Physics"));
        researchCourses.addCourse(new ResearchCourse("Machine Learning", "AI & Data Science"));

        // Display courses by category
        System.out.println("Exam-Based Courses:");
        examCourses.displayCourses();

        System.out.println("\nAssignment-Based Courses:");
        assignmentCourses.displayCourses();

        System.out.println("\nResearch-Based Courses:");
        researchCourses.displayCourses();

        // Combine all courses into a single list using wildcards
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.addAll(examCourses.getCourses());
        allCourses.addAll(assignmentCourses.getCourses());
        allCourses.addAll(researchCourses.getCourses());

        System.out.println("\n=== Displaying All Courses ===");
        CourseManager.displayAllCourses(allCourses);
    }
}


// Exam-Based Courses:
// Mathematics 101 [Science] - Exam-Based Evaluation
// Physics 201 [Engineering] - Exam-Based Evaluation

// Assignment-Based Courses:
// Creative Writing [Arts] - Assignment-Based Evaluation
// Software Development [Computer Science] - Assignment-Based Evaluation

// Research-Based Courses:
// Quantum Computing [Physics] - Research-Based Evaluation
// Machine Learning [AI & Data Science] - Research-Based Evaluation

// === Displaying All Courses ===
// All Available Courses:
// Mathematics 101 [Science] - Exam-Based Evaluation
// Physics 201 [Engineering] - Exam-Based Evaluation
// Creative Writing [Arts] - Assignment-Based Evaluation
// Software Development [Computer Science] - Assignment-Based Evaluation
// Quantum Computing [Physics] - Research-Based Evaluation
// Machine Learning [AI & Data Science] - Research-Based Evaluation