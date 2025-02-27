package excercise1.journalists;

import excercise1.articles.Article;
import excercise1.persistance.InMemoryArticles;
import excercise1.ui.articles.WriteArticleMenuController;
import java.util.List;

public class Journalist {
  final double salary = 1500;
  private final InMemoryArticles inMemoryArticles = new InMemoryArticles();
  String name;
  String dni;

  public Journalist(String name, String dni) {
    this.name = name;
    this.dni = dni;
  }

  public String getName() {
    return name;
  }

  public void writeArticle() {
    WriteArticleMenuController controller = new WriteArticleMenuController(this);
    controller.run();
  }

  public void deleteArticle(String heading) {
    inMemoryArticles.delete(heading);
  }

  public List<Article> getArticles() {
    return inMemoryArticles.getByJournalist(this);
  }

  public Article getArticleByHeading(String heading) {
    return inMemoryArticles.getByHeading(this, heading);
  }
}
