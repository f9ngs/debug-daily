import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class OldPrototype {
    public static void main(String[] args) {
        String puzzle = "example";
        String expectedOutput = "blablabla";
        String anothertry = "y";

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.println("Hello, today's date is " + today.format(formatter));
        System.out.println("Here's today's puzzle. Good luck!\n");


        Scanner input = new Scanner(System.in);

        while (anothertry.equalsIgnoreCase("y")) {
            System.out.println(puzzle + "\nSubmit Your Answer: ");
            String submittedAnswer = input.nextLine();

            if (submittedAnswer.equals(expectedOutput)) {
                System.out.println("The answer you submitted is correct, good job!");
                System.exit(0);
            } else {
                System.out.println("The answer you submitted is incorrect.");
                System.out.print("Do you want to try again? (y/n): ");


                anothertry = input.nextLine().trim();

                while (!anothertry.equalsIgnoreCase("y") && !anothertry.equalsIgnoreCase("n")) {
                    System.out.print("Please submit a 'y' or 'n' answer: ");
                    anothertry = input.nextLine().trim();
                }

                if (anothertry.equalsIgnoreCase("n")) {
                    System.out.println("Good luck next time!");
                }
            }
        }
    }
}
