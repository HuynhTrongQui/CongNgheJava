package vn.edu.tdtu.javatech.lab5.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Starting Logout Servlet!!!");
        System.out.println("Initializing ....");
    }

    @Override
    public void destroy() {
        System.out.println("Deleting Servlet!!!");
    }

    private void clearSession() {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
    }
}