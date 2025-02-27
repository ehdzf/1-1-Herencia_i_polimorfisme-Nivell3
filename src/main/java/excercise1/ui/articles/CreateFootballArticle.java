package excercise1.ui.articles;

import excercise1.articles.Article;
import excercise1.articles.FootballArticle;
import excercise1.journalists.Journalist;

public class CreateFootballArticle extends CreateTeamSportArticle {
    private String player;

    public String getPlayer() {
        return player;
    }

    @Override
    public Article create() {
        return new FootballArticle(getContent(), getHeading(), getJournalist(), getComptetition(), getTeam(), getPlayer());
    }

    public CreateFootballArticle(Journalist journalist) {
        super(journalist);
        this.player = setProperty("Insert player name: ");

    }
}
