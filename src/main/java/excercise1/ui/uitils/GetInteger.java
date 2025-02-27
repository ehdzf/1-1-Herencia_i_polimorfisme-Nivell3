package excercise1.ui.uitils;

import java.util.Scanner;

public class GetInteger {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInteger() {
        while (true) {
            try {

                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {

                RenderText.render("⚠️ Please insert a valid integer number.");
            }

        }
    }
}
