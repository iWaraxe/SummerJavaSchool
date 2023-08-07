package lecture2.loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        /*
        while (condition) {
          // Code to be executed
        }
        */

        // Example 1
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        // Example 2
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);

    }
}
