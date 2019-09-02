package pl.ds.servlet;

public class Player {
    private String name;
    private String club;
    private String country;
    private int goals;
    private int assist;

    public Player(String name, String club, String country, int goals, int assist) {
        this.name = name;
        this.club = club;
        this.country = country;
        this.goals = goals;
        this.assist = assist;
    }

    public String getName() {
        return name;
    }

    public String getClub() {
        return club;
    }

    public String getCountry() {
        return country;
    }

    public int getAssist() {
        return assist;
    }

    public int getGoals() {
        return goals;
    }

    public int getCanadian(){
      return goals+assist;
    }
}
