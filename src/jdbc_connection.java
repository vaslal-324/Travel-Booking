/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author VASUDHA
 */
import java.sql.*;

public class jdbc_connection {
    public Connection getObj() {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sample","root", "Vasu$0308" );
        if(con!=null){
            System.out.println("connection success");
        }
        else
            System.out.println("Connection failure");
        return con;
        /*Statement st  = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student");
        while(rs.next()){
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        //System.out.println(rs.getInt(1) + rs.getString(2));
        //rs.next();
        //System.out.println(rs.getInt(1) + " " + rs.getString(2));
        con.close();*/
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
