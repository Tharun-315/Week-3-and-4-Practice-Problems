// Program to check prime number
public class PrimeCheck {
    public static void main(String[] args) {

        // Declare variables
        int number = 7;
        boolean isPrime = true;

        // Loop to check prime
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Output result
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}