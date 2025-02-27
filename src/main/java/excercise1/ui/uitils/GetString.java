package excercise1.ui.uitils;

import java.util.Scanner;

public class GetString {
    private static final Scanner scanner = new Scanner(System.in);
    public static String getString(String message) {
        RenderText.render(message);
        return scanner.nextLine();
    }
}
