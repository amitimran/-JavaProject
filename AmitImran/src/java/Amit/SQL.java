
package Amit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL {
    
    static Connection con;
    
    public static Connection getConnection()
    {
        try
        {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=master;user=sa;password=123");
        if(con.isClosed())
        {
            System.out.println("not connected");
        }
        else{
            System.out.println("connected");
        }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.err.println("Problem: "+e);
        }
    
    return con;
    }
}
