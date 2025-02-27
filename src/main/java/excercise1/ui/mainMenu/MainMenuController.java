package excercise1.ui.mainMenu;

import excercise1.ui.journalists.JournalistMenu;
import excercise1.ui.uitils.RenderText;

public class MainMenuController {

  public boolean runMainMenu(int choice, boolean isRunning) {
    switch (choice) {
      case 0 -> isRunning = !isRunning;
      case 1 -> JournalistMenu.addJournalist();
      case 2 -> JournalistMenu.deleteJournalist();
      case 3 -> JournalistMenu.addArticle();
      case 4 -> JournalistMenu.deleteArticle();
      case 5 -> JournalistMenu.showArticles();
      case 6 -> JournalistMenu.getArticleScore();
      case 7 -> JournalistMenu.getArticlePrice();
      default -> RenderText.render("hola");
    }
    return isRunning;
  }
}
