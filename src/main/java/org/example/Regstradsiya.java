package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class Regstradsiya extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ism = req.getParameter("ism");
        String familasi = req.getParameter("familiya");
        String email = req.getParameter("email");
        String telefon = req.getParameter("telefon");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String password1 = req.getParameter("password1");
        Baza baza = new Baza();
        if(password.equals(password1)){
            Users users = new Users(ism,familasi,email,telefon,login,password);
            try {
                boolean yaratish = baza.yaratish(users);
                if (yaratish){

                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
