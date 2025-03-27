// ResearchCourse.java
public class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public String getEvaluationMethod() {
        return "Research-Based Evaluation";
    }
}
