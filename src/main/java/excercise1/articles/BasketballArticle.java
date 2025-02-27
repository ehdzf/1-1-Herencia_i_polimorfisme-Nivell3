package excercise1.articles;

import excercise1.journalists.Journalist;

public class BasketballArticle extends TeamSportArticle {

  @Override
  void calculatePrice() {
    int price = 250;

    if (this.competition.equals("Eurolliga")) {
      price += 75;
    }

    if (bonusTeams.contains(this.team)) {
      price += 75;
    }

    this.setPrice(price);
  }

  @Override
  void calculateScore() {
    int score = 4;

    if (this.competition.equals("Eurolliga")) {
      score += 3;
    } else if (this.competition.equals("ACB")) {
      score += 2;
    }

    if (bonusTeams.contains(this.team)) {
      score++;
    }

    this.setScore(score);
  }

  public BasketballArticle(
      String content, String heading, Journalist journalist, String competition, String team) {
    super(content, heading, journalist, competition, team);
    this.calculatePrice();
    this.calculateScore();
  }
}
