package pl.ds.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TeamList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Team> list = new ArrayList<>();
        Team team1 = new Team("Real Madrid C.F", "ESP", "Final");
        Team team2 = new Team("FC Barcelona", "ESP", "Semi-Final");
        Team team3 = new Team("Manchester City", "ENG", "Semi-Final");
        Team team4 = new Team("Liverpool", "ENG", "Final");
        Team team5 = new Team("Paris-Saint-Germain", "FRA", "Quater-Fianel");
        Team team6 = new Team("Juventus FC", "ITA", "Quater-Final");
        Team team7 = new Team("FC Porto", "POR", "Quater-Final");
        Team team8 = new Team("CSKA Moscov", "RUS", "Quater-Final");
        list.add(team1);
        list.add(team2);
        list.add(team3);
        list.add(team4);
        list.add(team5);
        list.add(team6);
        list.add(team7);
        list.add(team8);
        List<Team> sorted;
        sorted = list.stream().sorted(Comparator.comparing(Team::getName)).collect(Collectors.toList());
        HttpSession session = req.getSession();
        session.setAttribute("teams", sorted);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("teamlist.jsp");
        requestDispatcher.forward(req, resp);
    }
}
