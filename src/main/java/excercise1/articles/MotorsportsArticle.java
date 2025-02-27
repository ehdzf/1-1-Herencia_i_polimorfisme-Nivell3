package excercise1.articles;

import excercise1.journalists.Journalist;

import java.util.Set;

public abstract class MotorsportsArticle extends Article{
    protected final Set<String> bonusConstructors;
    String constructor;
    @Override
    void calculatePrice() {
        int price = 100;
        if (bonusConstructors.contains(this.constructor)){
            price +=50;
        }
        setPrice(price);
    }

    abstract void calculateScore() ;

    public MotorsportsArticle(String content, String heading, Journalist journalist, Set<String> bonusConstructors, String constructor) {
        super(content, heading, journalist);
        this.bonusConstructors = bonusConstructors;
        this.constructor = constructor;
    }
}
