package lecture2.loops;

public class ForLoops {
    public static void main(String[] args) {
        /*
        for (initialization; condition; increment) {
            // Code to be executed
        }
        */

        // Example 1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // Example 2
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum is " + sum);

    }
}
