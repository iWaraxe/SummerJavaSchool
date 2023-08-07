package lecture2.arrays;

public class IntroToArrays {
    public static void main(String[] args) {
        int[] scores = new int[5];

        /*
          0   1   2   3   4
        [___|___|___|___|___]
        */

        int[] numbers_declared;

        int[] numbers_allocated = new int[5];

        int[] numbers_specified = {1, 2, 3, 4, 5};

        int[] numbers = {10, 20, 30, 40, 50};
        int firstNumber = numbers[0]; // This will assign the value 10 to firstNumber

        numbers[2] = 99; // This changes the value at index 2 (the third position) to 99

        // Array Iteration

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced For Loop

        for (int number : numbers) {
            System.out.println(number);
        }

        // Example 1
        int[] ints = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int number : ints) {
            sum += number;
        }

        System.out.println("The sum of the ints is: " + sum);

        // Example 2
        int[] values = {3, 9, 2, 8, 5};
        int max = values[0]; // Start with the first value

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        System.out.println("The maximum value is: " + max);

    }
}
