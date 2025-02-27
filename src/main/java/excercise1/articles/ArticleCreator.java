package excercise1.articles;

import excercise1.journalists.Journalist;
import excercise1.persistance.InMemoryArticles;
import excercise1.ui.articles.*;
import excercise1.ui.uitils.RenderText;

public class ArticleCreator {
  private final Journalist journalist;
  private final InMemoryArticles handler = new InMemoryArticles();
  private CreateArticle creator;
  private Article article;

  private void createArticle() {
    this.article = this.creator.create();
  }

  private void persistArticle() {
    handler.add(this.article);
  }

  private void processArticle() {
    this.createArticle();
    this.persistArticle();
    RenderText.render("🚀 Article successfully created; ");
  }

  public void createFootballArticle() {
    this.creator = new CreateFootballArticle(this.journalist);
    this.processArticle();
  }

  public void createBasketballArticle() {
    this.creator = new CreateBasketballArticle(this.journalist);
    this.processArticle();
  }

  public void createTennisArticle() {
    this.creator = new CreateTennisArticle(this.journalist);
    this.processArticle();
  }

  public void createF1Article() {
    this.creator = new CreateF1Article(this.journalist);
    this.processArticle();
  }

  public void createMotorcycleArticle() {
    this.creator = new CreateMotorcycleArticle(this.journalist);
    this.processArticle();
  }

  public ArticleCreator(Journalist journalist) {
    this.journalist = journalist;
  }
}
