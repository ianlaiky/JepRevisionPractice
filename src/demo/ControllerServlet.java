package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Ian on 24/11/2016.
 */
@WebServlet(name = "ControllerServlet", urlPatterns = "/controller")
public class ControllerServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int guessInt = Integer.parseInt(request.getParameter("guess"));
        HttpSession session = request.getSession();
        String nric = (String) session.getAttribute("nric");
        String email = (String) session.getAttribute("email");
        session.setAttribute("guss",guessInt);
        int result = Guess.getInstance().guess(nric, guessInt);

        if (result == 0) {

            getServletContext().getRequestDispatcher("/sucess.jsp").forward(request, response);
        } else if (result == 999) {
            getServletContext().getRequestDispatcher("/nomore.jsp").forward(request, response);

        } else if (result == 1) {
            request.setAttribute("gus", "higher");
            getServletContext().getRequestDispatcher("/tryagain.jsp").forward(request, response);

        } else if (result == -1) {
            request.setAttribute("gus", "lower");
            getServletContext().getRequestDispatcher("/tryagain.jsp").forward(request, response);
        }

//i


    }


}
