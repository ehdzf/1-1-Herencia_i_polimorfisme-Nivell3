package excercise1.ui.articles;

import excercise1.articles.Article;
import excercise1.articles.TennisArticle;
import excercise1.journalists.Journalist;

public  class CreateTennisArticle extends CreateArticle {
    private final String competition;
    private String[] players = new String[2];
    @Override
    public Article create() {
        return new TennisArticle(this.getContent(), this.getHeading(), this.getJournalist(), this.getCompetition(), this.getPlayers());
    }

    public String getCompetition() {
        return competition;
    }

    public String[] getPlayers() {
        return players;
    }

    public CreateTennisArticle(Journalist journalist) {
        super(journalist);
        this.competition = setProperty("Insert competition: ");
        this.players[0] = setProperty("Insert Player 1 name: ");
        this.players[1] = setProperty("Insert Player 2 name: ");
    }
}
