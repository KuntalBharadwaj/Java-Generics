// CourseManager.java
import java.util.List;

public class CourseManager {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        System.out.println("All Available Courses:");
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}
