package excercise1.articles;

import excercise1.journalists.Journalist;

import java.util.HashSet;
import java.util.Set;

abstract class TeamSportArticle extends Article{
    protected final Set<String> bonusTeams = new HashSet<>(Set.of("Barça", "Madrid"));
    String competition;
    String team;

    public TeamSportArticle(String content, String heading, Journalist journalist, String competition, String team) {
        super(content, heading, journalist);
        this.competition = competition;
        this.team = team;
    }
}
