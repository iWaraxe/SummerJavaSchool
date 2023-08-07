package lecture2.conditionals;

public class SwitchOperators {
    public static void main(String[] args) {

        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            //... other days
            default:
                System.out.println("Invalid day");
                break;
        }

        // Example 1
        int score = 85;
        char grade;

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            //... other grades
            default:
                grade = 'F';
                break;
        }

        System.out.println("Grade is: " + grade);

        // Example 2
        String day = "Tuesday";
        String typeOfDay;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                typeOfDay = "Weekday";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                typeOfDay = "Invalid day";
                break;
        }

        System.out.println("It's a " + typeOfDay);


    }
}
