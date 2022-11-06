import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();
        mainThree(userInput);
        while (userInput != 0) {
            printMenu();
            userInput = scanner.nextInt();
            mainThree(userInput);
        }
        System.out.println("Bye...");
    }
    public static void printMenu() {
        System.out.println("1. Run tests");
        System.out.println("2. Try it");
        System.out.println("0. Exit");
    }

    public static void mainThree (int userInput) {
// основное ветвление
        if (userInput > 2) {
            System.out.println("OOps try again");
        } else if (userInput == 1) {
            TestRunner.main();
        } else if (userInput == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input string:");
            String userStringInput;
            userStringInput = scanner.nextLine();
            System.out.println(StringCutter.stringCutter(userStringInput));
        } else if (userInput != 0) {
            System.out.println("OOps try again");
        }
    }
}