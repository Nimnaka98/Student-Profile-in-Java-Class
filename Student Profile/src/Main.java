public class Main {
    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Nimnaka", "Kumaradasa", "Software Engineering", 3.75, 2023);
        StudentProfile profileTwo = new StudentProfile("Dineli", "Gampolage", "Software Engineering", 2.75, 2024);

        profileTwo.incrementExpectedGraduateYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }
}