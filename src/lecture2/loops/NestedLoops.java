package lecture2.loops;

public class NestedLoops {
    public static void main(String[] args) {
        /*
        for (initialization1; condition1; increment1) {
            for (initialization2; condition2; increment2) {
                // Code to be executed inside inner loop
            }
            // Code to be executed inside outer loop
        }
        */

        // Example 1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Example 2
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

    }
}
