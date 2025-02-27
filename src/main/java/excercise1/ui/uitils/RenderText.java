package excercise1.ui.uitils;

import java.util.List;

public class RenderText {
  public static void render(String string) {
    System.out.println(string);
  }

  public static void render(Number number) {
    System.out.println(number);
  }

  public static void render(List<String> strings) {
    for (String string : strings) {
      System.out.println(string);
    }
  }
}
