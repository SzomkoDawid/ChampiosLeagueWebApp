package pl.ds.servlet;

public class Team {
    private String name;
    private String country;
    private String achievment;

    public Team(String name, String country, String achievment) {
        this.name = name;
        this.country = country;
        this.achievment = achievment;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getAchievment() {
        return achievment;
    }

}
