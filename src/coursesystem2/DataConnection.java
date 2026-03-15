/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursesystem2;

import java.sql.*;
public class DataConnection {
    public static Connection connectCourseDB2()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
                    Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ibrahim\\Desktop\\CourseSystem2\\CourseDB2.db");
                    System.out.println("Connected");
                    return con;
        }
        catch (Exception e)
        {
            System.out.println("Connection Failed");
            return null;
        }
    }
}
