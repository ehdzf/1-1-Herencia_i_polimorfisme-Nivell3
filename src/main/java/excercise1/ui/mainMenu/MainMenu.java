package excercise1.ui.mainMenu;

import excercise1.ui.uitils.DisplayMultilineMenu;
import excercise1.ui.uitils.GetIntOption;

public class MainMenu {

  private boolean isRunning = true;

  public void start() {
    MainMenuController controller = new MainMenuController();
    GetIntOption getter = new GetIntOption(MainMenuSettings.min, MainMenuSettings.max);
    while (isRunning) {
      int choice;
      DisplayMultilineMenu.display(MainMenuSettings.options);
      choice = getter.getOption();
      isRunning = controller.runMainMenu(choice, isRunning);
    }
  }
}
