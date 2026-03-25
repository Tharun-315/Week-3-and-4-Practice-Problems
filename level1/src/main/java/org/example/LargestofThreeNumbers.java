// Program to find largest of three numbers
public class LargestNumber {
    public static void main(String[] args) {

        // Declare variables
        int a = 10;
        int b = 25;
        int c = 15;

        // Find largest using if-else-if
        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
    }
}