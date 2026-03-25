// Program to print multiplication table
public class MultiplicationTable {
    public static void main(String[] args) {

        // Declare variables
        int number = 5;
        int i = 1;

        // While loop
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}