package com.Shop.InternetShop;

import com.Shop.InternetShop.Model.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            resp.setContentType("text/html");

            Integer id = (Integer) req.getSession().getAttribute("idUser");

            if (id == null) {
                resp.sendRedirect("auth");
            } else {

                Order Value = Information.getInstance().map.get(id);

                if (Value == null) {
                    Information.getInstance().map.put(id, new Order());
                    req.getRequestDispatcher("/index.jsp").forward(req, resp);
                }

            }

        }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id =  (Integer) req.getSession().getAttribute("idUser");

        String product = req.getParameter("button");
        Information.getInstance().map.get(id).addGoods(Integer.parseInt(product));
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
