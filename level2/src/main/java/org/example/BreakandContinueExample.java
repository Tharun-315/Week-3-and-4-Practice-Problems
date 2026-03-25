// Program demonstrating break and continue
public class BreakContinueDemo {
    public static void main(String[] args) {

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Skip number 5
            if (i == 5) {
                continue;
            }

            // Stop loop at 8
            if (i == 8) {
                break;
            }

            System.out.println(i);
        }
    }
}