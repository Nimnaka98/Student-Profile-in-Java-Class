public class StudentProfile {
    String firstName;
    String lastName;
    String declaredMajor;
    double GPA;
    int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName, String declaredMajor, double GPA, int expectedYearToGraduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.GPA = GPA;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedGraduateYear() {

    }
}
