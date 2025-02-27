package excercise1.articles;

import excercise1.journalists.Journalist;
import java.util.HashSet;
import java.util.Set;

public class FootballArticle extends TeamSportArticle{

    private final Set<String> bonusTeams = new HashSet<>(Set.of("Barça", "Madrid"));
    private final Set<String> bonusPlayers = new HashSet<>(Set.of("Ferran Torres", "Benzema"));

    String player;

    @Override
    void calculatePrice() {
        int price = 300;

        if (this.competition.equals("Lliga de Campions")){
            price += 100;
        }

        if (bonusTeams.contains(this.team)){
            price += 100;
        }

        if (bonusPlayers.contains(this.player)){
            price += 50;
        }

        this.setPrice(price);
    }

    @Override
    void calculateScore() {
        int score = 5;

        if (this.competition.equals("Lliga de campions")){
            score += 3;
        }else if (this.competition.equals("Lliga")) {
            score +=2;
        }

        if (bonusTeams.contains(this.team)){
            score ++;
        }

        if (bonusPlayers.contains(this.player)){
            score ++;
        }

        this.setScore(score);
    }


    public FootballArticle(String content, String heading, Journalist journalist, String competition, String team, String player) {
        super(content, heading, journalist, competition, team);
        this.player = player;
        this.calculatePrice();
        this.calculateScore();
    }
}
