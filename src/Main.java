import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your message: ");
        String input = scan.nextLine();
        boolean validInput = false;

        while (!validInput) {
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Input cannot be empty.");
                System.out.print("Your message: ");
                input = scan.nextLine();
            } else {
                try {
                    System.out.println("Morse code: " + MorseCodeTranslator.toMorse(input));
                    validInput = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Use the letters A-Z or the numbers 1-9.");
                    System.out.print("Your message: ");
                    input = scan.nextLine();
                }
            }
        }

        System.out.println("Your message in Morse code: ");
        input = scan.nextLine();
        validInput = false;
        while (!validInput) {
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Input cannot be empty. Please enter in Morse code: ");
                input = scan.nextLine();
            } else if (input.equalsIgnoreCase("help")) {
                for (Map.Entry<Character, String> entry : MorseCodeHashmaps.TO_MORSE.entrySet()) {
                    System.out.println(entry.getKey() + " = " + entry.getValue());
                }
                System.out.println("Your message in Morse code: ");
                input = scan.nextLine();
            } else {
                try {
                    System.out.println("Alphabet: " + MorseCodeTranslator.fromMorse(input));
                    validInput = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Use a valid Morse code. Type help for Morse codes.");
                    System.out.println("Your message in Morse code: ");
                    input = scan.nextLine();
                }
            }
        }
    }
}
