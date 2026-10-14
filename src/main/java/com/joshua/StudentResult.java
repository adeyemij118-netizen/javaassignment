public class StudentResult {
    public static void main(String[] args) {

        String studentName = "Goodluck";

        int score = 75;

        String grade = "";

        if (score < 0 || score > 100) {
            grade = "Invalid score";
        } else if (score >= 70) {
            grade = "A";
        } else if (score >= 60) {
            grade = "B";
        } else if (score >= 50) {
            grade = "C";
        } else if (score >= 45) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Student Name: " + studentName);

        System.out.println("Score: " + score);

        System.out.println("Grade: " + grade);
    }
}
