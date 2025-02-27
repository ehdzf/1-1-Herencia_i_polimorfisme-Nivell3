package excercise1.ui.articles;

import excercise1.articles.Article;
import excercise1.articles.F1Article;
import excercise1.journalists.Journalist;

public class CreateF1Article extends CreateMotorsportsArticle {


    @Override
    public Article create() {
        return new F1Article(this.getContent(),
                this.getHeading(),
                this.getJournalist(),
                this.getConstructor()
                );
    }

    public CreateF1Article(Journalist journalist) {
        super(journalist);

    }
}
