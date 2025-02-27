package excercise1.ui.mainMenu;

import java.util.ArrayList;
import java.util.List;

public class MainMenuSettings {
  static int min = 0;
  static int max = 7;
  static ArrayList<String> options =
      new ArrayList<>(
          List.of(
              "Please select one ooption:",
              "1.- Add journalist.",
              "2.- Delete journalist.",
              "3.- Add article to journalist.",
              "4.- Delete article.",
              "5.- View journalist's articles.",
              "6.- Show article score.",
              "7.- Show article price.",
              "0.- Exit"));
}
