package excercise1.articles;

import excercise1.journalists.Journalist;
import java.util.HashSet;
import java.util.Set;

public class F1Article extends MotorsportsArticle{
    @Override
    void calculateScore() {
        int score = 4;
        if (this.bonusConstructors.contains(this.constructor)){
            score +=2;
        }

        setScore(score);
    }

    public F1Article(String content, String heading, Journalist journalist,  String constructor) {

        super(content,
                heading,
                journalist,
                new HashSet<>(Set.of("Ferrari", "Mercedes")),
                constructor);
        this.calculatePrice();
        this.calculateScore();
    }
}

