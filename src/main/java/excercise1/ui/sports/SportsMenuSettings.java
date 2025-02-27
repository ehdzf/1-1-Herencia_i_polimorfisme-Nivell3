package excercise1.ui.sports;

import java.util.ArrayList;
import java.util.List;

public class SportsMenuSettings {
  static int min = 0;
  static int max = 5;
  static ArrayList<String> options =
      new ArrayList<>(
          List.of(
              "Please select one option:",
              "1.- Football.",
              "2.- Basketball.",
              "3.- Tennis.",
              "4.- F1.",
              "5.- Motorcycles.",
              "0.- Return to previous menu."));
}
