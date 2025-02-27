package excercise1.ui.sports;

import excercise1.sports.Sport;
import excercise1.ui.uitils.DisplayMultilineMenu;
import excercise1.ui.uitils.GetIntOption;
import excercise1.ui.uitils.GetSport;
import java.util.List;

public class SportsMenu {

  public Sport getSport() {
    int choice;
    int min = SportsMenuSettings.min;
    int max = SportsMenuSettings.max;
    List<String> options = SportsMenuSettings.options;
    GetIntOption getter = new GetIntOption(min, max);
    while (true) {
      DisplayMultilineMenu.display(options);
      choice = getter.getOption();
      if (choice == 0) {
        return null;
      }
      Sport chosenSport = GetSport.get(choice);
      if (chosenSport != null) {
        return chosenSport;
      }
    }
  }
}
