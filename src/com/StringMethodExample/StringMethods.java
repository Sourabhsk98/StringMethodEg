package com.StringMethodExample;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();


        // Display menu to the user
        System.out.println("Choose a string operation:");
        System.out.println("1. Length");
        System.out.println("2. Uppercase");
        System.out.println("3. Lowercase");
        System.out.println("4. Character at index");
        System.out.println("5. Substring");
        System.out.println("6. Replace");
        System.out.println("7. Contains");
        System.out.println("8. Index of");
        System.out.println("9. Last index of");
        System.out.println("10. Concatenation");

        // Read user choice
        System.out.print("Enter your choice (1-10): ");
        int choice = scanner.nextInt();

        // Process user choice using switch case
        switch (choice) {
            case 1:
                lengthOperation(userInput);
                break;
            case 2:
                uppercaseOperation(userInput);
                break;
            case 3:
                lowercaseOperation(userInput);
                break;
            case 4:
                charAtIndexOperation(userInput, scanner);
                break;
            case 5:
                substringOperation(userInput, scanner);
                break;
            case 6:
                replaceOperation(userInput, scanner);
                break;
            case 7:
                containsOperation(userInput, scanner);
                break;
            case 8:
                indexOfOperation(userInput, scanner);
                break;
            case 9:
                lastIndexOfOperation(userInput, scanner);
                break;
            case 10:
                concatenationOperation(userInput, scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method for length operation
    private static void lengthOperation(String input) {
        System.out.println("Length of the string: " + input.length());
    }

    // Method for uppercase operation
    private static void uppercaseOperation(String input) {
        System.out.println("Uppercase: " + input.toUpperCase());
    }

    // Method for lowercase operation
    private static void lowercaseOperation(String input) {
        System.out.println("Lowercase: " + input.toLowerCase());
    }

    // Method for character at index operation
    private static void charAtIndexOperation(String input, Scanner scanner) {
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < input.length()) {
            System.out.println("Character at index " + index + ": " + input.charAt(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method for substring operation
    private static void substringOperation(String input, Scanner scanner) {
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();
        if (startIndex > 0 && endIndex < input.length() && startIndex < endIndex) {
            System.out.println("Substring: " + input.substring(startIndex, endIndex));
        } else {
            System.out.println("Invalid indices.");
        }
    }

    // Method for replace operation
    private static void replaceOperation(String input, Scanner scanner) {
        System.out.print("Enter character you want to replace: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter replacement character: ");
        char newChar = scanner.next().charAt(0);
        System.out.println("Replace: " + input.replace(oldChar, newChar));
    }

    // Method for contains operation
    private static void containsOperation(String input, Scanner scanner) {
        System.out.print("Enter substring to check: ");
        String substring = scanner.next();
        System.out.println("Contains: " + input.contains(substring));
    }

    // Method for index of operation
    private static void indexOfOperation(String input, Scanner scanner) {
        System.out.print("Enter character to find: ");
        char findChar = scanner.next().charAt(0);
        System.out.println("Index of " + findChar + ": " + input.indexOf(findChar));
    }

    // Method for last index of operation
    private static void lastIndexOfOperation(String input, Scanner scanner) {
        System.out.print("Enter character to find: ");
        char findLastChar = scanner.next().charAt(0);
        System.out.println("Last index of " + findLastChar + ": " + input.lastIndexOf(findLastChar));
    }

    // Method for concatenation operation
    private static void concatenationOperation(String input, Scanner scanner) {
        System.out.print("Enter string to concatenate: ");
        String concatStr = scanner.next();
        System.out.println("Concatenation: " + input.concat(concatStr));

   }
}


