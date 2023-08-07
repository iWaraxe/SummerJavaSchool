package lecture1.homework;

import java.util.Scanner;

public class UserInputOutput {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Asking for the user's name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Asking for the user's age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Printing a greeting message
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Closing the Scanner object
        scanner.close();
    }
}
