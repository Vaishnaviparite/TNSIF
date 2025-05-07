package DayFourteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTable {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded successfully");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PNQ07", "root", "root");
            System.out.println("Connection created successfully");

            Statement stmt = con.createStatement();
            System.out.println("Statement create successfully");

            String q = "create table Student(stdid int, sname varchar(20), subject varchar(20), duration double)";
            stmt.execute(q);

            con.close();

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }
    }

}
