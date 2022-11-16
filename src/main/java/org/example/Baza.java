package org.example;

import java.sql.*;

public class Baza {
    private String url="jdbc:postgresql://localhost:5432/";
    private String usernew="postgres";
    private String password="5599";

    public boolean yaratish(Users users) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url,usernew,password);
        String query="insert into baza(ism,familiya,telefon,email,login,parol) values(?,?,?,?,?,?)";
        PreparedStatement ps=connection.prepareStatement(query);
        ps.setString(1,users.getIsm());
        ps.setString(2,users.getFamilasi());
        ps.setString(3,users.getTelefon());
        ps.setString(4,users.getEmail());
        ps.setString(5,users.getLogin());
        ps.setString(6,users.getPassword());
        ps.executeUpdate();
        return true;
    }


}
