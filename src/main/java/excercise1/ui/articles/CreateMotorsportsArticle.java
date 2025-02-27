package excercise1.ui.articles;

import excercise1.articles.Article;
import excercise1.journalists.Journalist;

public abstract class CreateMotorsportsArticle extends CreateArticle {
    private final String constructor;

    public String getConstructor() {
        return constructor;
    }

    public abstract Article create();

    protected CreateMotorsportsArticle(Journalist journalist) {
        super(journalist);
        this.constructor = setProperty("Insert constructor's name: ");
    }
}
