package excercise1.ui.articles;

import excercise1.articles.Article;
import excercise1.journalists.Journalist;
import excercise1.ui.uitils.GetString;

public abstract class CreateArticle {
  private final String heading;
  private final String content;
  private final Journalist journalist;

  protected static String setProperty(String message) {
    return GetString.getString(message);
  }

  public abstract Article create();

  public Journalist getJournalist() {
    return journalist;
  }

  public String getHeading() {
    return heading;
  }

  public String getContent() {
    return content;
  }

  protected CreateArticle(Journalist journalist) {
    this.heading = setProperty("Please insert the Article header: ");
    this.content = setProperty("Please insert the Article content: ");
    this.journalist = journalist;
  }
}
