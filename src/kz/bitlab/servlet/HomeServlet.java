package kz.bitlab.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.db.DBManager;
import kz.bitlab.model.Item;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Item> items= DBManager.getItems();
        req.setAttribute("items", items);
        req.getRequestDispatcher("home.jsp").forward(req,resp);

    }
}
