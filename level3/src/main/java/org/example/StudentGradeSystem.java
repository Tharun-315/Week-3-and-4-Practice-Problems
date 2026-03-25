// Program to calculate grade
public class GradeSystem {
    public static void main(String[] args) {

        // Declare variable
        int marks = 85;

        // Check grade
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Grade B");
        } else if (marks >= 50 && marks < 75) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}