
import java.util.Scanner;

public class DigitCounts {

    // Count how many times each digit appears
    public static int[] count(long num) {
        int[] counts = new int[10];

        String number = String.valueOf(num);

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            int value = Character.getNumericValue(digit);

            if (value >= 0 && value <= 9) {
                counts[value]++;
            }
        }

        return counts;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = input.nextLong();

        int[] result = count(num);

        for (int digit = 0; digit <= 9; digit++) {
            if (result[digit] > 0) {
                String word = (result[digit] == 1) ? "time" : "times";

                 System.out.println("Digit " + digit + " occurs "
        + result[digit] + " " + word);
            }
        }

        input.close();
    }
}
