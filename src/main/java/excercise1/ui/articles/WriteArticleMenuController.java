package excercise1.ui.articles;

import excercise1.articles.ArticleCreator;
import excercise1.journalists.Journalist;
import excercise1.sports.Sport;
import excercise1.ui.sports.SportsMenu;
import excercise1.ui.uitils.RenderText;

public class WriteArticleMenuController {

  ArticleCreator articleCreator;

  public WriteArticleMenuController(Journalist journalist) {
    this.articleCreator = new ArticleCreator(journalist);
  }

  public void run() {
    Sport sport;
    SportsMenu menu = new SportsMenu();
    sport = menu.getSport();
    switch (sport) {
      case FOOTBALL -> this.articleCreator.createFootballArticle();
      case BASKETBALL -> this.articleCreator.createBasketballArticle();
      case TENNIS -> this.articleCreator.createTennisArticle();
      case F1 -> this.articleCreator.createF1Article();
      case MOTORCYCLE -> this.articleCreator.createMotorcycleArticle();
      default -> RenderText.render("Invalid sport");
    }
  }
}
