package com.Shop.InternetShop;

import com.Shop.InternetShop.Model.Information;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer UserID;

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        UserID = Information.getInstance().getIdUserByLogPas(login,password);


        Integer id =  (Integer) req.getSession().getAttribute("idUser");


            if (Information.getInstance().getLogin(login, password)) {
                if(!UserID.equals(id)) {

                    req.getSession().setAttribute("idUser", UserID);
                    req.getSession().setAttribute("login", login);
                    req.getRequestDispatcher("/index.jsp").forward(req, resp);

                }else {
                    resp.sendRedirect("/hello");
                }

            } else {

                if (login != null && password != null){
                    req.setAttribute("message","Неверный логин или пароль");
                }

                req.getRequestDispatcher("/authorization.jsp").forward(req, resp);
            }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("regLogin");
        String password = req.getParameter("regPassword");
        int id = Information.getInstance().getSizeUsers();

        if(!login.equals("") && !password.equals("")){
            id++;

            Information.getInstance().addUser(id,login,password);
            req.setAttribute("regMessage","Регистраци прошла успешно");
            req.getRequestDispatcher("/authorization.jsp").forward(req, resp);
        }
        else{
            req.setAttribute("regMessage","Ошибка ввода данных");
            req.getRequestDispatcher("/authorization.jsp").forward(req, resp);
        }
    }
}
