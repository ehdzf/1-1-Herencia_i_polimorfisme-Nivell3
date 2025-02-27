package excercise1.articles;

import excercise1.journalists.Journalist;

public abstract class Article {
    String heading;
    String content;
    private int score;
    private int price;
    Journalist journalist;

    public int getPrice(){
        return this.price;
    }
    public int  getScore(){
        return this.score;
    }
    abstract void calculatePrice();
    abstract void calculateScore();


    protected void setScore(int score) {
        this.score = score;
    }

    protected void setPrice(int price) {
        this.price = price;
    }
    public Journalist getJournalist(){
        return this.journalist;
    }

    public String getHeading() {
        return heading;
    }

    public String getContent() {
        return content;
    }

    protected Article(String content, String heading, Journalist journalist) {
        this.content = content;
        this.heading = heading;
        this.journalist = journalist;
    }
}
