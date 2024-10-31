package vn.edu.tdtu.javatech.lab5.servlets;

import vn.edu.tdtu.javatech.lab5.dao.UserDAO;
import vn.edu.tdtu.javatech.lab5.model.User;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {

    private UserDAO userDAO;

    @Override
    public void init() throws ServletException {
        System.out.println("Starting Register Servlet!!!");
        System.out.println("Initializing ....");
        this.userDAO = new UserDAO();
    }

    @Override
    public void destroy() {
        System.out.println("Deleting Servlet!!!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        try {
            User user = new User(username, email, password);
            userDAO.add(user);
            System.out.println("User " + username + " successfully registered!!!");
            response.sendRedirect("/Lab5/Login");
        }catch (Exception ex) {
            System.out.println("Failed to register!!");
            System.out.println(ex.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/register.jsp").forward(request, response);
    }
}