import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        // Create a Scanner to get input from the user.
        // Display a menu for Democrat, Republican, and Independent.
        // Ask the user to enter D, R, or I.
        // Use a cascaded if structure to check the choice.
        // If the choice is D, display the Democratic Donkey response.
        // If the choice is R, display the Republican Elephant response.
        // If the choice is I, display the Independent Person response.
        // Otherwise, display the Other response.

        Scanner in = new Scanner(System.in);
        String choice = "";

        System.out.println("Party Affiliation Menu");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");

        choice = in.nextLine();

        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }

        in.close();
    }
}
