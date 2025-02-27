package excercise1.ui.articles;

import excercise1.articles.Article;
import excercise1.journalists.Journalist;

public  class CreateTeamSportArticle extends CreateArticle {
    private String comptetition;
    private String team;

    public String getComptetition() {
        return comptetition;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public Article create() {
        return null;
    }

    public CreateTeamSportArticle(Journalist journalist) {
        super(journalist);
        this.comptetition = setProperty("Insert competition name: ");
        this.team  = setProperty("Insert team name: ");
    }
}
