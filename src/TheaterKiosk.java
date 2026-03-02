import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // PSEUDO-CODE:
        // 1) Prompt for age
        // 2) If hasNextInt() read age; clear buffer
        // 3) If age >= 21 print "You get a wrist band!"
        // 4) Else do nothing (no output)
        // 5) If invalid, read as String and print friendly error

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine(); // clear buffer

            if (age >= 21) {
                System.out.println("You get a wrist band!");
            }
            // else: intentionally no output
        } else {
            String trash = in.nextLine();
            System.out.println("\nYou said your age was: " + trash);
            System.out.println("Run the program again and enter a valid integer age!");
        }
    }
}