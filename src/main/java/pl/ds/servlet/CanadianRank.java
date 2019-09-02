package pl.ds.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CanadianRank extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("button1") != null) {
            List<Player> players = (List<Player>) req.getSession().getAttribute("scorers");
            List<Player> sorted;
            sorted = players.stream().sorted(Comparator.comparing(Player::getCanadian).reversed()).collect(Collectors.toList());
            HttpSession session = req.getSession();
            session.setAttribute("canadian", sorted);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("scorers.jsp");
            requestDispatcher.forward(req, resp);

        }

    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
