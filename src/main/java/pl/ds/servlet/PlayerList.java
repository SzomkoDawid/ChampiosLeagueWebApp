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

public class PlayerList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Player> playerList = new ArrayList<>();
        Player player = new Player("Cristiano Ronaldo", "Juventus FC", "Portugal", 11, 2);
        Player player1 = new Player("Lionel Messi", "FC Barcelona", "Argentina", 9, 3);
        Player player2 = new Player("Robert Lewandowski", "Bayern Munchen", "Poland", 7, 0);
        Player player3 = new Player("Neymar Jr.", "Paris-Saint-Germain", "Brazil", 6, 4);
        Player player4 = new Player("Luka Modric", "Real Madrid", "Croatia", 0, 4);
        Player player5 = new Player("Paul Pogba", "Manchester United", "France", 2, 2);
        Player player6 = new Player("Karim Benzema", "Real Madrid", "France", 4, 1);
        Player player7 = new Player("Dusan Tadic", "Ajax Amsterdam", "Serbia", 4, 5);
        Player player8 = new Player("Cristian Eriksen", "Tottenham Hotspur", "Denmark", 0, 3);
        Player player9 = new Player("Kylian Mbappe", "Paris-Saint-Germain", "France", 4, 0);
        playerList.add(player);
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);
        playerList.add(player6);
        playerList.add(player7);
        playerList.add(player8);
        playerList.add(player9);
        List<Player> sorted;
        sorted = playerList.stream()
                .sorted(Comparator.comparing(Player::getGoals).thenComparing(Player::getAssist).reversed()).collect(Collectors.toList());
        HttpSession session = req.getSession();
        session.setAttribute("scorers", sorted);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("scorers.jsp");
        requestDispatcher.forward(req, resp);
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
