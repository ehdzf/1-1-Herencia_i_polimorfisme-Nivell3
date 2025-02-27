package excercise1.ui.articles;

import excercise1.articles.Article;
import excercise1.articles.BasketballArticle;
import excercise1.journalists.Journalist;

public class CreateBasketballArticle extends CreateTeamSportArticle {


    @Override
    public Article create() {
        return new BasketballArticle(getContent(), getHeading(), getJournalist(), getComptetition(), getTeam());
    }

    public CreateBasketballArticle(Journalist journalist) {
        super(journalist);

    }
}
