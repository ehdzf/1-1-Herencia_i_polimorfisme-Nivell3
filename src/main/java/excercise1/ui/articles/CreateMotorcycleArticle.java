package excercise1.ui.articles;

import excercise1.articles.Article;
import excercise1.articles.MotorcyleArticle;
import excercise1.journalists.Journalist;

public class CreateMotorcycleArticle extends CreateMotorsportsArticle {


    @Override
    public Article create() {
        return new MotorcyleArticle(
                this.getContent(),
                this.getHeading(),
                this.getJournalist(),
                this.getConstructor()
                );
    }

    public CreateMotorcycleArticle(Journalist journalist) {
        super(journalist);

    }
}
