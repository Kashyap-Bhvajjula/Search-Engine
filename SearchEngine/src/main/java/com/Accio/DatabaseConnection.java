package com.Accio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static Connection connection = null;
    public static Connection getConnection(){
        if(connection != null){
            return connection;
        }
        String user = "{user}";// {User} should be replaced with the username of our database user
        String pwd = "{Password}";//{Password} should be replaced with the password of our database user
        String db = "{searchengine}"; //{searchengine}  should be replaced with the name of the database stored in the system
        return getConnection(user, pwd, db);
    }

    private static Connection getConnection(String user, String pwd, String db){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/"+db+"?user="+user+"&password="+pwd);
        }
        catch(SQLException | ClassNotFoundException sqlException)
        {
            sqlException.printStackTrace();
        }
        return connection;
    }
}
