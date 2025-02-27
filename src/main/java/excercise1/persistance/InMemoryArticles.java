package excercise1.persistance;

import excercise1.articles.Article;
import excercise1.journalists.Journalist;
import excercise1.ui.uitils.RenderText;
import java.util.ArrayList;
import java.util.List;

public class InMemoryArticles {
  private static final List<Article> all = new ArrayList<>();

  private boolean checkExists(String title) {
    return all.stream().anyMatch(a -> a.getHeading().equalsIgnoreCase(title));
  }

  public void add(Article article) {
    all.add(article);
  }

  public void delete(String heading) {
    boolean exists = checkExists(heading);
    if (!exists) {
      RenderText.render("Article not found");
    }
    all.removeIf(a -> a.getHeading().equalsIgnoreCase(heading));
    RenderText.render("Article " + heading + "deleted.");
  }

  public List<Article> getByJournalist(Journalist journalist) {
    return all.stream().filter(a -> a.getJournalist().equals(journalist)).toList();
  }

  public Article getByHeading(Journalist journalist, String heading) {
    return this.getByJournalist(journalist).stream()
        .filter(a -> a.getHeading().equalsIgnoreCase(heading))
        .findFirst()
        .orElse(null);
  }
}
