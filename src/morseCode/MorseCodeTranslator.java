package morseCode;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please choose an option:");
        System.out.println("1. Morse to English");
        System.out.println("2. English to Morse");

        int choice = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the text:");
        String inputText = scan.nextLine();

        String outputText = "";

        try {
            if (choice == 1) {
                outputText = MorseCodeConverter.convertMorseToEnglish(inputText);
            } else if (choice == 2) {
                outputText = MorseCodeConverter.convertEnglishToMorse(inputText);
            } else {
                throw new IllegalArgumentException("Invalid choice");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Input contains unsupported characters.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid choice.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Translation: " + outputText);

    }
}
