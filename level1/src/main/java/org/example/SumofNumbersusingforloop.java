// Program to calculate sum of first N numbers
public class SumForLoop {
    public static void main(String[] args) {

        // Declare variables
        int n = 5;
        int sum = 0;

        // Loop to calculate sum
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        // Display result
        System.out.println("Sum = " + sum);
    }
}