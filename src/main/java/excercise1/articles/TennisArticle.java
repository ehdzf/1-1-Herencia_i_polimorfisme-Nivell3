package excercise1.articles;

import excercise1.journalists.Journalist;
import java.util.HashSet;
import java.util.Set;

public class TennisArticle extends Article{
    private final Set<String> bonusPlayers = new HashSet<>(Set.of("Federer", "Nadal", "Djokovic"));
    String competition;
    String[] players = new String[2];
    @Override
    void calculatePrice() {
        int price = 150;
        for (String player: players) {
            if (bonusPlayers.contains(player)) {
                price += 100;
            }
        }

        this.setPrice(price);
    }

    @Override
    void calculateScore() {
        int score = 4;

        for (String player: players) {
            if (bonusPlayers.contains(player)) {
                score += 2;
            }
        }

        this.setScore(score);
    }

    public TennisArticle(String content, String heading, Journalist journalist, String competition, String[] players) {
        super(content, heading, journalist);
        this.competition = competition;
        this.players = players;
        this.calculateScore();
        this.calculatePrice();
    }
}
