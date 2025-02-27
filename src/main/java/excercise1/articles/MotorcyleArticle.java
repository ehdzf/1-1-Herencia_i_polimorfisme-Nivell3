package excercise1.articles;

import excercise1.journalists.Journalist;
import java.util.HashSet;
import java.util.Set;

public class MotorcyleArticle extends MotorsportsArticle {


    public MotorcyleArticle(String content, String heading, Journalist journalist,  String constructor) {
        super(content,
                heading,
                journalist,
                new HashSet<>(Set.of("Honda", "Yamaha")),
                constructor);
        this.calculatePrice();
        this.calculateScore();
    }

    @Override
    void calculateScore() {
        int score = 3;
        if (this.bonusConstructors.contains(this.constructor)) {
            score += 3;
        }

        setScore(score);
    }
}
