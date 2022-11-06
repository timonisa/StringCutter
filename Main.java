import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String userInput;
        userInput = scanner.nextLine();
        System.out.println(StringCutter.stringCutter(userInput));
        TestRun.tests();
    }
}