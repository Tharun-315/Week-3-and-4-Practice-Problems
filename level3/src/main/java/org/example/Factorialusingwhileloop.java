// Program to find factorial
public class FactorialWhile {
    public static void main(String[] args) {

        // Declare variables
        int number = 5;
        int factorial = 1;
        int i = 1;

        // While loop
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }

        // Output result
        System.out.println("Factorial = " + factorial);
    }
}