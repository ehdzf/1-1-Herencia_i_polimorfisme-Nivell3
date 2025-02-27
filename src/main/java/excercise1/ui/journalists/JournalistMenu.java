package excercise1.ui.journalists;

import excercise1.articles.Article;
import excercise1.journalists.Journalist;
import excercise1.persistance.InMemoryArticles;
import excercise1.persistance.InMemoryJournalists;
import excercise1.ui.uitils.GetString;
import excercise1.ui.uitils.RenderText;
import java.util.List;

public class JournalistMenu {
  private static final InMemoryJournalists handler = new InMemoryJournalists();
  private static final InMemoryArticles articlesHandler = new InMemoryArticles();

  public static void addJournalist() {
    Journalist journalist;
    String name = GetString.getString("Insert journalist name: ");
    String dni = GetString.getString("Insert journalist id number: ");
    journalist = new Journalist(name, dni);
    boolean success = handler.add(journalist);
    if (success) {
      RenderText.render("🪄 Journalist created successfully!");
    }
  }

  public static void deleteJournalist() {
    String name = GetString.getString("Insert the name of whom you want to delete:");
    boolean success = handler.delete(name);
    if (success) {

      RenderText.render("🪄 Journalist deleted successfully!");
    }
  }

  public static void addArticle() {
    Journalist journalist = getJournalist();
    if (journalist != null) {
      journalist.writeArticle();
    } else {
      RenderText.render("⚠️ Journalist not found.");
    }
  }

  private static Journalist getJournalist() {
    String name = GetString.getString("Please insert the journalist's name");
    return handler.getByName(name);
  }

  public static void showArticles() {
    Journalist journalist = getJournalist();
    List<Article> articleList = journalist.getArticles();
    for (Article a : articleList) {
      RenderText.render("Title:\n" + a.getHeading());
      RenderText.render("Content:\n" + a.getContent());
      RenderText.render("________________________________");
    }
  }

  public static void deleteArticle() {
    Journalist journalist = getJournalist();
    String heading =
        GetString.getString("Please insert the heading of the article you want to delete: ");
    journalist.deleteArticle(heading);
  }

  public static void getArticleScore() {
    Article article = getArticle();
    int score = article.getScore();
    RenderText.render(score);
  }

  public static void getArticlePrice() {
    Article article = getArticle();
    int price = article.getPrice();
    RenderText.render(price);
  }

  private static Article getArticle() {
    Journalist journalist = getJournalist();
    String heading =
        GetString.getString("Please insert the heading of the article you want to delete: ");
    Article article = journalist.getArticleByHeading(heading);
    return article;
  }
}
