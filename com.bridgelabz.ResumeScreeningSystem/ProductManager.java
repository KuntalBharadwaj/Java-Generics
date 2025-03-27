// ProductManager.java
public class ProductManager extends JobRole {
    public ProductManager(String candidateName, String skills, int experience) {
        super(candidateName, skills, experience);
    }

    @Override
    public String getJobRole() {
        return "Product Manager";
    }
}
