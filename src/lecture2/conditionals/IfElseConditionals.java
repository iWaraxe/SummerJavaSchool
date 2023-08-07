package lecture2.conditionals;

public class IfElseConditionals {
    public static void main(String[] args) {
        /*
        if (condition) {
            // code to run if condition is true
        } else {
            // code to run if condition is false
        }
        */

        // 1st example
        int x = 10;

        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is not greater than 5");
        }

        // 2nd example
        int number = 42;

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }


        /*
        if (condition1) {
            // code for condition1
        } else if (condition2) {
            // code for condition2
        } else {
            // code if none of the conditions are true
        }
        */

        int age = 18;

        if (age >= 18) {
            System.out.println("You are an adult.");
            if (age == 18) {
                System.out.println("Congratulations on becoming an adult!");
            }
        } else {
            System.out.println("You are a minor.");
        }


    }
}
